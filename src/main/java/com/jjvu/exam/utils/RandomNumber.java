package com.jjvu.exam.utils;

import java.util.Random;

/**
 * 生成随机数组
 * @author SongM
 * @date 2017年11月29日 下午1:35:33
 */
public class RandomNumber {

	/**
	 * get
	 * @param count 随机数范围1~count
	 * @param temp 需要多少随机数
	 * @return
	 */
	public static int[] get(int count, int temp) {
		int[] values = new int[count]; // 产生的数 
        int temp1,temp2,temp3;   
        Random r = new Random();   
        
        for(int i = 0;i < values.length;i++){
            values[i] = i + 1;
        }
        
        //随机交换values.length次   
        for(int i = 0;i < values.length;i++){   
            temp1 = Math.abs(r.nextInt()) % (values.length-1); //随机产生一个位置   
            temp2 = Math.abs(r.nextInt()) % (values.length-1); //随机产生另一个位置   
            // 如果这两个下标不相等的话，可以交换数组中的元素
            if(temp1 != temp2){
                temp3 = values[temp1];   
                values[temp1] = values[temp2];   
                values[temp2] = temp3;
            } 
        }
        
        // 选出需要的随机数个数
        int[] t = new int[temp];
        for(int i = 0; i < temp; i++){
        	t[i] = values[i];
        }
        
        return t;
	}
	
}
