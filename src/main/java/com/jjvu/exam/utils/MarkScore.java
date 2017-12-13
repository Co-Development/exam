package com.jjvu.exam.utils;

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
		
		String[] x1Scores = FieldUtil.getStringValues(x1);
		String[] y1Scores = FieldUtil.getStringValues(y1);
		
		int count = 0;
		
		for (int i = 0; i < x1Scores.length; i++) {
			if (x1Scores[i]!=null) {
				//比较两个字符串是否相等
				if (x1Scores[i].equals(y1Scores[i])) {
					count++;
				} 
			}
		}
		System.out.println("单选题正确的分数" + count);
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
		
		String[] x2Scores = FieldUtil.getStringValues(x2);
		String[] y2Scores = FieldUtil.getStringValues(y2);
		

		for (int i = 0; i < x2Scores.length; i++) {
			if(x2Scores[i] != null) {
				if(x2Scores[i].length() == y2Scores[i].length()) {
					String[] split= x2Scores[i].split(",");
					for (String string : split) {
						if(y2Scores[i].indexOf(string) == -1) {
							count--;
							break;
						}
					}
				}else {
					count--;
				}
			}else {
				count--;
			}
			
		}
		System.out.println("多选题正确的分数" + count);
		return count;
	}

	/**
	 * 判断题打分
	 * @param x3
	 * @param y3
	 * @return
	 */
	public static int sum3(X3 x3, Y3 y3) {
		
		Integer[] x3Scores = FieldUtil.getIntegerValues(x3);
		Integer[] y3Scores = FieldUtil.getIntegerValues(y3);
		
		int count = 0;
		
		for (int i = 0; i < x3Scores.length; i++) {
			if (x3Scores[i]!=null) {
				//比较两个字符串是否相等
				if (x3Scores[i].equals(y3Scores[i])) {
					count++;
				} 
			}
		}
		System.out.println("判断题正确的分数" + count);
		return count;

	}

}
