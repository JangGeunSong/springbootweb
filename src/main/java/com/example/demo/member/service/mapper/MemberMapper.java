package com.example.demo.member.service.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.member.service.MemberVO;

@Repository
public interface MemberMapper {
	
	public List<MemberVO> selectMemberList() throws Exception;
	
}
