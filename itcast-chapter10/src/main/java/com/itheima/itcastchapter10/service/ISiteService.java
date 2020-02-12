package com.itheima.itcastchapter10.service;


import com.itheima.itcastchapter10.model.ResponseData.StaticticsBo;
import com.itheima.itcastchapter10.model.domain.Article;
import com.itheima.itcastchapter10.model.domain.Comment;

import java.util.List;

/**
 * @Classname ISiteService
 * @Description 博客站点统计服务
 * @Date 2019-3-14 10:13
 * @Created by CrazyStone
 */
public interface ISiteService {
    // 最新收到的评论
    List<Comment> recentComments(int count);

    // 最新发表的文章
    List<Article> recentArticles(int count);

    // 获取后台统计数据
    StaticticsBo getStatistics();

    // 更新某个文章的统计数据
    void updateStatistics(Article article);
}

