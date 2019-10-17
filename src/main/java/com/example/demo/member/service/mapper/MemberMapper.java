package com.example.demo.member.service.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.member.service.MemberVO;

@Repository
public interface MemberMapper {
	
	public List<MemberVO> selectMemberList() throws Exception;

	public void createMember(@ModelAttribute MemberVO memberVO, ModelMap map) throws Exception;
	
}
