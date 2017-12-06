package com.jjvu.exam.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jjvu.exam.po.Examen;

/**
 * 考生-Mapper
 * @author SongM
 * @date 2017年11月29日 下午12:59:12
 */
@Mapper
public interface ExamenMapper {

	/**
	 * 通过考生姓名和考生所在部门查询
	 * @param examen_name 考生姓名
	 * @param examen_dpm 考生所在部门
	 * @return
	 */
	@Select("SELECT * FROM `examen` WHERE examen_name=#{examen_name} AND examen_dpm=#{examen_dpm}")
	Examen findByName_Dpm(@Param("examen_name") String examen_name, @Param("examen_dpm") String examen_dpm);

	/**
	 * 通过考生ID查询
	 * @param examen_id
	 * @return
	 */
	@Select("SELECT * FROM `examen` WHERE examen_id=#{examen_id}")
	Examen findById(@Param("examen_id") int examen_id);

	/**
	 * 打分
	 * @param examen_id
	 * @param score
	 */
	@Update("UPDATE `examen` SET `examen_score`=#{score}, `examen_time`=#{time} WHERE (`examen_id`=#{examen_id})")
	void markScoreById(@Param("examen_id") int examen_id, @Param("score") int score, @Param("time") String time);
	
}
