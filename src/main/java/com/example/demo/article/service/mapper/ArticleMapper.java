package com.example.demo.article.service.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.article.service.ArticleVO;

@Repository
public interface ArticleMapper {

    public List<ArticleVO> selectAtricleList() throws Exception;

    public void createArticle(String title, String contents, String CREA_ID) throws Exception;

}