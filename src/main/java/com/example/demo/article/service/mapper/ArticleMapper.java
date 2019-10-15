package com.example.demo.article.service.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.article.service.ArticleVO;


@Repository
public interface ArticleMapper {

    public ArticleVO createAtricle(String email, String password) throws Exception;

    public List<ArticleVO> selectAtricleList() throws Exception;

}