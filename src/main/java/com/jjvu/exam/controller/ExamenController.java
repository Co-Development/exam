package com.jjvu.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jjvu.exam.mapper.ExamenMapper;
import com.jjvu.exam.mapper.Test1Mapper;
import com.jjvu.exam.mapper.Test2Mapper;
import com.jjvu.exam.mapper.Test3Mapper;
import com.jjvu.exam.mapper.Test4Mapper;

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
	
}
