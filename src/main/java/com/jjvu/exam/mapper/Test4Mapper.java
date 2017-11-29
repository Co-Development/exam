package com.jjvu.exam.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jjvu.exam.po.Test4;

/**
 * 判断题-Mapper
 * @author SongM
 * @date 2017年11月29日 下午12:59:12
 */
@Mapper
public interface Test4Mapper {

	/**
	 * 通过题目ID查询
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM `test4` WHERE test_id=#{id}")
	Test4 findById(@Param("id") int id);
	
}
