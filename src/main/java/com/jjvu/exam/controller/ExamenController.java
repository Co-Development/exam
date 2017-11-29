package com.jjvu.exam.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jjvu.exam.mapper.ExamenMapper;
import com.jjvu.exam.mapper.Test1Mapper;
import com.jjvu.exam.mapper.Test2Mapper;
import com.jjvu.exam.mapper.Test3Mapper;
import com.jjvu.exam.mapper.Test4Mapper;
import com.jjvu.exam.po.Test1;
import com.jjvu.exam.po.Test2;
import com.jjvu.exam.po.Test3;
import com.jjvu.exam.po.Test4;
import com.jjvu.exam.utils.RandomNumber;

/**
 * 考生-Controller
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
	
	/**
	 * 考生登录
	 * @param examen_name 考生姓名
	 * @param examen_dpm 考生所在部门
	 * @return
	 */
	@RequestMapping(value = "/login", method = {RequestMethod.POST})
	String login(String examen_name, String examen_dpm) {
		
		return "";
	}
	
	@RequestMapping(value = "/start", method = {RequestMethod.GET})
	String start() {
		// 容器初始化-考试试卷题
		ArrayList<Test1> list1 = new ArrayList<Test1>();
		ArrayList<Test2> list2 = new ArrayList<Test2>();
		ArrayList<Test3> list3 = new ArrayList<Test3>();
		ArrayList<Test4> list4 = new ArrayList<Test4>();
		
		// 共40道三项单选题，随机生成35道
		int[] ids = RandomNumber.get(40, 35);
		for (int id : ids) {
			Test1 test1 = test1Mapper.findById(id);
			list1.add(test1);
		}
		
		// 共15道四项单选题，随机生成10道
		ids = RandomNumber.get(15, 10);
		for (int id : ids) {
			Test2 test2 = test2Mapper.findById(id);
			list2.add(test2);
		}
		
		// 共25道四项多选题，随机生成20道
		ids = RandomNumber.get(25, 20);
		for (int id : ids) {
			Test3 test3 = test3Mapper.findById(id);
			list3.add(test3);
		}
		
		// 共40道判断题，随机生成35道
		ids = RandomNumber.get(40, 35);
		for (int id : ids) {
			Test4 test4 = test4Mapper.findById(id);
			list4.add(test4);
		}
		
		return "";
	}
	
}
