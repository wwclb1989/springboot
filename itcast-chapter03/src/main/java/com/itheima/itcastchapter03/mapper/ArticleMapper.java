package com.itheima.itcastchapter03.mapper;

import com.itheima.itcastchapter03.domain.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    Article selectArticle(Integer id);

    int updateArticle(Article article);
}
