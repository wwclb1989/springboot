package com.itheima.itcastchapter10.service;

import com.github.pagehelper.PageInfo;
import com.itheima.itcastchapter10.model.domain.Comment;

/**
 * @Classname ICommentService
 * @Description 文章评论业务处理接口
 * @Date 2019-3-14 10:13
 * @Created by CrazyStone
 */
public interface ICommentService {
    // 获取文章下的评论
    PageInfo<Comment> getComments(Integer aid, int page, int count);

    // 用户发表评论
    void pushComment(Comment comment);

}

