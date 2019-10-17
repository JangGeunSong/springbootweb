package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.member.service.MemberVO;
import com.example.demo.member.service.mapper.MemberMapper;
import com.example.demo.article.service.ArticleVO;
import com.example.demo.article.service.mapper.ArticleMapper;

@Controller
@EnableAutoConfiguration
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

	// This member mapper will be use for page's authentication.
	@Autowired
	private MemberMapper memberMapper;
	
	@RequestMapping(value = "/usrdata", method = RequestMethod.GET)
	@ResponseBody
	public List<MemberVO> home() throws Exception {
		List<MemberVO> list = memberMapper.selectMemberList();
		
		return list;
	}

	@RequestMapping(value = "/usrdata", method = RequestMethod.POST)
	@ResponseBody
	public String createMember(MemberVO memberVO, Model map) throws Exception {
		// member create logic

		System.out.println(memberVO);

		logger.debug("Test form: { }", memberVO);

		return "index";
	}

	@Autowired
	private ArticleMapper articleMapper;

	@RequestMapping(value = "/article", method = RequestMethod.GET)
	@ResponseBody
	public List<ArticleVO> getArticleInfo() throws Exception {
		List<ArticleVO> list = articleMapper.selectAtricleList();

		return list;
	}

	@RequestMapping(value = "/article", method = RequestMethod.POST)
	@ResponseBody
	public void createArticle(Object articleInfo) throws Exception {
		// Input article infomation to the database and create articles
	}

}
