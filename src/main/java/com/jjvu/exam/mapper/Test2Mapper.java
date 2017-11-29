package com.jjvu.exam.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jjvu.exam.po.Test2;

/**
 * 四项单选题-Mapper
 * @author SongM
 * @date 2017年11月29日 下午1:00:39
 */
@Mapper
public interface Test2Mapper {

	/**
	 * 通过题目ID查询
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM `test2` WHERE test_id=#{id}")
	Test2 findById(@Param("id") int id);
	
}
