package com.itcast.itcastchapter06.repository;

import com.itcast.itcastchapter06.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    // 根据评论id修改评论作者author
    @Transactional
    @Modifying
    @Query("UPDATE t_comment c SET c.author = ?1 WHERE c.id = ?2")
    int updateComment(String author, Integer id);

}
