package com.jjvu.exam.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jjvu.exam.mapper.ExamenMapper;
import com.jjvu.exam.mapper.Test1Mapper;
import com.jjvu.exam.mapper.Test2Mapper;
import com.jjvu.exam.mapper.Test3Mapper;
import com.jjvu.exam.mapper.Test4Mapper;
import com.jjvu.exam.po.Examen;
import com.jjvu.exam.po.Test1;
import com.jjvu.exam.po.Test2;
import com.jjvu.exam.po.Test3;
import com.jjvu.exam.po.Test4;
import com.jjvu.exam.po.X1;
import com.jjvu.exam.po.X2;
import com.jjvu.exam.po.X3;
import com.jjvu.exam.po.Y1;
import com.jjvu.exam.po.Y2;
import com.jjvu.exam.po.Y3;
import com.jjvu.exam.utils.MarkScore;
import com.jjvu.exam.utils.RandomNumber;

/**
 * 考生-Controller
 * 
 * @author SongM
 * @date 2017年11月29日 下午1:05:35
 */
@Controller
@RequestMapping("examen")
public class ExamenController {

	@Autowired
	private ExamenMapper examenMapper;

	@Autowired
	private Test1Mapper test1Mapper;

	@Autowired
	private Test2Mapper test2Mapper;

	@Autowired
	private Test3Mapper test3Mapper;

	@Autowired
	private Test4Mapper test4Mapper;
	private String begintime;
	private String endtime;

	/**
	 * 考生登录
	 * 
	 * @param examen_name
	 *            考生姓名
	 * @param examen_dpm
	 *            考生所在部门
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	@ResponseBody
	HashMap<Object, Object> login(String examen_name, String examen_dpm, HttpServletRequest request, Model model) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("state", 0); // state为0表示登录信息有误，为1表示登录成功

		// 去除姓名两边空格
		examen_name = examen_name.trim();

		// 登录信息查询
		Examen examen = examenMapper.findByName_Dpm(examen_name, examen_dpm);

		// 验证登录信息
		if (examen == null) {
			return map;
		}
		// 考生id存入session
		HttpSession session = request.getSession();
		session.setAttribute("exam-id", examen.getExamen_id());
		session.setAttribute("username", examen.getExamen_name());
		session.setMaxInactiveInterval(86400); // 默认保存1天
		/*
		 * String examen_id = request.getSession().getAttribute("exam-name").toString();
		 * System.out.println(examen_id);
		 */
		// 设置相应数据
		map.put("state", 1);
		map.put("url", "/examen/main");

		return map;
	}

	/**
	 * 登录后的后台
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/main", method = { RequestMethod.GET })
	String main(HttpServletRequest request, Model model) {
		try {
			// 通过考生ID查询考生信息
			int examen_id = Integer.parseInt(request.getSession().getAttribute("exam-id").toString());
			Examen examen = examenMapper.findById(examen_id);
			// 验证考试是否完成
			if (examen.getExamen_time() == null || examen.getExamen_time().equals("")) { // 还没考试，jsp显示开始考试按钮
				model.addAttribute("exam_finish", false);
			} else { // 考试完成，发送分数
				model.addAttribute("exam_finish", true);
				model.addAttribute("exam_score", examen.getExamen_score());
			}
			return "main";
		} catch (Exception e) {
			return "../../login";
		}
	}

	/**
	 * 开始考试
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/start", method = { RequestMethod.GET })
	String start(Model model) {
		// 容器初始化-考试试卷题
		ArrayList<Test1> list1 = new ArrayList<Test1>();
		ArrayList<Test2> list2 = new ArrayList<Test2>();
		ArrayList<Test3> list3 = new ArrayList<Test3>();
		ArrayList<Test4> list4 = new ArrayList<Test4>();

		// 共38道三项单选题，随机生成35道
		int[] ids = RandomNumber.get(38, 35);
		for (int id : ids) {
			Test1 test1 = test1Mapper.findById(id);

			// 选项打乱
			int[] options = RandomNumber.get(3, 3);
			String test_a = test1.getTest_a();
			String test_b = test1.getTest_b();
			String test_c = test1.getTest_c();
			int count = 0;
			String str = null;
			for (int option : options) {
				count++;
				switch (count) {
				case 1:
					str = test_a;
					break;
				case 2:
					str = test_b;
					break;
				case 3:
					str = test_c;
					break;
				}
				switch (option) {
				case 1:
					test1.setTest_a(str);
					break;
				case 2:
					test1.setTest_b(str);
					break;
				case 3:
					test1.setTest_c(str);
					break;
				}
			}

			list1.add(test1);
		}

		// 共17道四项单选题，随机生成10道
		ids = RandomNumber.get(17, 10);
		for (int id : ids) {
			Test2 test2 = test2Mapper.findById(id);

			// 选项打乱
			int[] options = RandomNumber.get(4, 4);
			String test_a = test2.getTest_a();
			String test_b = test2.getTest_b();
			String test_c = test2.getTest_c();
			String test_d = test2.getTest_d();
			int count = 0;
			String str = null;
			for (int option : options) {
				count++;
				switch (count) {
				case 1:
					str = test_a;
					break;
				case 2:
					str = test_b;
					break;
				case 3:
					str = test_c;
					break;
				case 4:
					str = test_d;
					break;
				}
				switch (option) {
				case 1:
					test2.setTest_a(str);
					break;
				case 2:
					test2.setTest_b(str);
					break;
				case 3:
					test2.setTest_c(str);
					break;
				case 4:
					test2.setTest_d(str);
					break;
				}
			}

			list2.add(test2);
		}

		// 共25道四项多选题，随机生成20道
		ids = RandomNumber.get(25, 20);
		for (int id : ids) {
			Test3 test3 = test3Mapper.findById(id);

			// 选项打乱
			int[] options = RandomNumber.get(4, 4);
			String test_a = test3.getTest_a();
			String test_b = test3.getTest_b();
			String test_c = test3.getTest_c();
			String test_d = test3.getTest_d();
			int count = 0;
			String str = null;
			for (int option : options) {
				count++;
				switch (count) {
				case 1:
					str = test_a;
					break;
				case 2:
					str = test_b;
					break;
				case 3:
					str = test_c;
					break;
				case 4:
					str = test_d;
					break;
				}
				switch (option) {
				case 1:
					test3.setTest_a(str);
					break;
				case 2:
					test3.setTest_b(str);
					break;
				case 3:
					test3.setTest_c(str);
					break;
				case 4:
					test3.setTest_d(str);
					break;
				}
			}

			list3.add(test3);
		}

		// 共40道判断题，随机生成35道
		ids = RandomNumber.get(40, 35);
		for (int id : ids) {
			Test4 test4 = test4Mapper.findById(id);
			list4.add(test4);
		}
		begintime = current_time();
		// 将试题发送至jsp
		model.addAttribute("list1", list1);
		model.addAttribute("list2", list2);
		model.addAttribute("list3", list3);
		model.addAttribute("list4", list4);

		return "start_exam";
	}

	/**
	 * 提交试卷并打分
	 * 
	 * @param request
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @return
	 */
	@RequestMapping(value = "/testSubmit", method = { RequestMethod.POST })
	@ResponseBody
	HashMap<Object, Object> testSubmit(HttpServletRequest request, X1 x1, Y1 y1, X2 x2, Y2 y2, X3 x3, Y3 y3) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		// map.put("state", 0); // state为0表示有题目还没做

		int score = 0;
		// try {
		// 打分
		score += MarkScore.sum1(x1, y1);
		score += MarkScore.sum2(x2, y2);
		score += MarkScore.sum3(x3, y3);
		System.out.println("用户：" + request.getSession().getAttribute("username").toString()
				+ "    this is Controller Score: " + score);
		// } catch (Exception e) {
		// return map;
		// }

		// 通过考生ID查询考生信息
		int examen_id = Integer.parseInt(request.getSession().getAttribute("exam-id").toString());
		// 将分数存入数据库

		endtime = current_time();

		long date1 = 0;
		long date2 = 0;
		try {
			SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			date1 = sdfs.parse(begintime).getTime();
			date2 = sdfs.parse(endtime).getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int minutess = (int) (((date2 - date1) / 1000) / 60);
		int seconds = (int) (((date2 - date1) / 1000) % 60);

		System.out.println("用户答题时间为：" + (minutess < 10 ? "0" + minutess : minutess) + ":"
				+ (seconds < 10 ? "0" + seconds : seconds));
		examenMapper.markScoreById(examen_id, score,
				(minutess < 10 ? "0" + minutess : minutess) + ":" + (seconds < 10 ? "0" + seconds : seconds));

		// 设置相应数据
		map.put("state", 1);
		map.put("url", "/examen/main");

		return map;
	}

	private String current_time() {

		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNowStr = sdf.format(d);

		return dateNowStr;
	}

}
