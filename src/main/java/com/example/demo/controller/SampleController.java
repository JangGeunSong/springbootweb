package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.member.service.MemberVO;
import com.example.demo.member.service.mapper.MemberMapper;

@Controller
@EnableAutoConfiguration
public class SampleController {

	@Autowired
	private MemberMapper memberMapper;
	
	@RequestMapping("/")
	@ResponseBody
	public String home() throws Exception {
		List<MemberVO> list = memberMapper.selectMemberList();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("name : " + list.get(i).getName());
			System.out.println("team : " + list.get(i).getTeam());
		}
		
		return "Hello Maven Mysql myBatis default setting";
	}
}
