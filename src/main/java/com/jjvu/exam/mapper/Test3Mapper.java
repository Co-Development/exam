package com.jjvu.exam.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jjvu.exam.po.Test3;

/**
 * 四项多选题-Mapper
 * @author SongM
 * @date 2017年11月29日 下午1:00:39
 */
@Mapper
public interface Test3Mapper {

	/**
	 * 通过题目ID查询
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM `test3` WHERE test_id=#{id}")
	Test3 findById(@Param("id") int id);
	
}
