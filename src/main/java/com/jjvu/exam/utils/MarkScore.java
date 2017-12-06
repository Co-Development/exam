package com.jjvu.exam.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.jjvu.exam.po.X1;
import com.jjvu.exam.po.X2;
import com.jjvu.exam.po.X3;
import com.jjvu.exam.po.Y1;
import com.jjvu.exam.po.Y2;
import com.jjvu.exam.po.Y3;

/**
 * 打分
 * 
 * @author SongM
 * @date 2017年11月29日 下午9:21:10
 */
public class MarkScore {

	/**
	 * 单选题打分
	 * @param x1
	 * @param y1
	 * @return
	 */
	public static int sum1(X1 x1, Y1 y1) {
		
		String x1Scores[] = FieldUtil.getObjectValues(x1);
		String y1Scores[] = FieldUtil.getObjectValues(y1);
		
		int count = 0;
		
		for (int i = 0; i < x1Scores.length; i++) {
			if(x1Scores[i] == y1Scores[i]) {
				count++;
			}
		}
		
		return count;
	}

	/**
	 * 多选题打分
	 * @param x2
	 * @param y2
	 * @return
	 */
	public static int sum2(X2 x2, Y2 y2) {
		
		int count = 20;
		
		String x2Scores[] = FieldUtil.getObjectValues(x2);
		String y2Scores[] = FieldUtil.getObjectValues(y2);
		
		for (int i = 0; i < x2Scores.length; i++) {
			if(x2Scores[i].length() == y2Scores[i].length()) {
				String[] split = x2Scores[i].split(",");
				for (String string : split) {
					if(y2Scores[i].indexOf(string) == -1) {
						count--;
						break;
					}
				}
			}else {
				count--;
			}
		}
		
		return count;
	}

	/**
	 * 判断题打分
	 * @param x3
	 * @param y3
	 * @return
	 */
	public static int sum3(X3 x3, Y3 y3) {
		
		String x3Scores[] = FieldUtil.getObjectValues(x3);
		String y3Scores[] = FieldUtil.getObjectValues(y3);
		
		int count = 0;
		
		for (int i = 0; i < x3Scores.length; i++) {
			if(x3Scores[i] == y3Scores[i]) {
				count++;
			}
		}
		
		return count;

	}

}
