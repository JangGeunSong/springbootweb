package com.example.demo.controller;

import java.util.List;

import com.example.demo.article.service.ArticleVO;
import com.example.demo.article.service.mapper.ArticleMapper;
import com.example.demo.member.service.MemberVO;
import com.example.demo.member.service.mapper.MemberMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public ModelAndView createMember(@ModelAttribute MemberVO member, Model model) {
		ModelAndView mv = new ModelAndView();
		model.addAttribute("result", member);

		// memberMapper.createMember(member);

		logger.debug("USR data : {}", member);

		mv.setViewName("redirect:index.html");
		// Redirect to the index.html page
		return mv;
	}

	// This article mapper will be CRUD page's article contents.
	@Autowired
	private ArticleMapper articleMapper;

	@RequestMapping(value = "/article", method = RequestMethod.GET)
	@ResponseBody
	public List<ArticleVO> getArticleInfo() throws Exception {
		List<ArticleVO> list = articleMapper.selectAtricleList();

		return list;
	}

	@RequestMapping(value = "/article", method = RequestMethod.POST)
	public ModelAndView createArticle(@ModelAttribute ArticleVO article, Model model) throws Exception {
		// Input article infomation to the database and create articles
		ModelAndView mv = new ModelAndView();

		articleMapper.createArticle(article);

		mv.setViewName("redirect:index.html");
		// Redirect to the index.html page
		return mv;
	}

}
