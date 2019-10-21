package com.example.demo.member.service.mapper;

import java.util.List;

import com.example.demo.member.service.MemberVO;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {
	
	public List<MemberVO> selectMemberList() throws Exception;

	public void createMember(MemberVO member);
	
}
