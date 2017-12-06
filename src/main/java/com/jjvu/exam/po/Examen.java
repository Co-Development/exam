package com.jjvu.exam.po;

import java.util.Date;

/**
 * 考生-实体类
 * @author SongM
 * @date 2017年11月29日 下午12:36:59
 */
public class Examen {

	private int examen_id;
	private String examen_name;
	private String examen_dpm;
	private int examen_score;
	private String examen_time;
	public int getExamen_id() {
		return examen_id;
	}
	public void setExamen_id(int examen_id) {
		this.examen_id = examen_id;
	}
	public String getExamen_name() {
		return examen_name;
	}
	public void setExamen_name(String examen_name) {
		this.examen_name = examen_name;
	}
	public String getExamen_dpm() {
		return examen_dpm;
	}
	public void setExamen_dpm(String examen_dpm) {
		this.examen_dpm = examen_dpm;
	}
	public int getExamen_score() {
		return examen_score;
	}
	public void setExamen_score(int examen_score) {
		this.examen_score = examen_score;
	}
	public String getExamen_time() {
		return examen_time;
	}
	public void setExamen_time(String examen_time) {
		this.examen_time = examen_time;
	}
	
}
