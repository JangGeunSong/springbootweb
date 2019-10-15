package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.article.service.ArticleVO;
import com.example.demo.article.service.mapper.ArticleMapper;

@Controller
@EnableAutoConfiguration
public class SampleController {
	// This member mapper will be use for page's authentication.
	// @Autowired
	// private MemberMapper memberMapper;
	
	// @RequestMapping("/usrdata")
	// @ResponseBody
	// public List<MemberVO> home() throws Exception {
	// 	List<MemberVO> list = memberMapper.selectMemberList();
		
	// 	for(int i = 0; i < list.size(); i++) {
	// 		System.out.println("name : " + list.get(i).getName());
	// 		System.out.println("team : " + list.get(i).getTeam());
	// 	}
		
	// 	return list;
	// }

	@Autowired
	private ArticleMapper articleMapper;

	@RequestMapping(value="/article", method=RequestMethod.GET)
	@ResponseBody
	public List<ArticleVO> getArticleInfo() throws Exception {
		List<ArticleVO> list = articleMapper.selectAtricleList();

		return list;
	}

	@RequestMapping(value="/article", method=RequestMethod.POST)
	@ResponseBody
	public void createArticle(Object articleInfo) throws Exception {
		// Input article infomation to the database and create articles
	}


}
