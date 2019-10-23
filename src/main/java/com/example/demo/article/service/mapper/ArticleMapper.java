package com.example.demo.article.service.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.article.service.ArticleVO;

@Repository
public interface ArticleMapper {

    public List<ArticleVO> selectAtricleList() throws Exception;

    public void createArticle(ArticleVO article) throws Exception;

    public void deleteArticle(int ArticleId) throws Exception;

    public void updateArticle(int ArticleId ,ArticleVO aritcle) throws Exception;

}