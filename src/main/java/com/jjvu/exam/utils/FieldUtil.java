package com.jjvu.exam.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * 处理对象类
 * 
 * @author Snail
 *
 */
public class FieldUtil {



	/**
	 * 根据属性名获取属性值
	 * 
	 * @param fieldName
	 *            属性名
	 * @param o
	 * @return
	 */
	private static Object getFieldValueByName(String fieldName, Object o) {

		try {
			// 获得属性名的首字母将其大写
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			// 获得该属性的get方法名
			String getter = "get" + firstLetter + fieldName.substring(1);
			// 获得方法对象，并执行
			Method method = o.getClass().getMethod(getter);
			Object value = method.invoke(o);
			return value;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	/**
	 * 获取属性名数组
	 * 
	 * @param o
	 * @return
	 */
	private static String[] getFiledName(Object o) {

		Field[] fields = o.getClass().getDeclaredFields();

		String[] fieldNames = new String[fields.length];

		for (int i = 0; i < fields.length; i++) {
			fieldNames[i] = fields[i].getName();
		}

		return fieldNames;
	}

	/**
	 * 获取对象的所有属性值，返回一个对象数组
	 * 
	 * @param object
	 * @return
	 */
	public static String[] getStringValues(Object object) {
		String[] fieldNames = getFiledName(object);
		String[] value = new String[fieldNames.length];

		for (int i = 0; i < value.length; i++) {
			value[i] = (String) getFieldValueByName(fieldNames[i], object);
		}

		return value;
	}

	/**
	 * 获取对象的所有属性值，返回一个对象数组
	 * 
	 * @param object
	 * @return
	 */
	public static Integer[] getIntegerValues(Object object) {
		String[] fieldNames = getFiledName(object);
		Integer[] value = new Integer[fieldNames.length];

		for (int i = 0; i < value.length; i++) {
			value[i] = (Integer) getFieldValueByName(fieldNames[i], object);
		}

		return value;
	}

}
