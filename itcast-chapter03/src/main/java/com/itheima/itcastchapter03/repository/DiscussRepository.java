package com.itheima.itcastchapter03.repository;

import com.itheima.itcastchapter03.domain.Discuss;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface DiscussRepository extends JpaRepository<Discuss, Integer> {

    // 1. 查询author非空的Discuss评论集合
    List<Discuss> findByAuthorNotNull();

    // 2.根据文章id分页查询Discuss评论集合
    @Query("SELECT c FROM t_comment c WHERE c.aId = ?1")
    List<Discuss> getDiscussPaged(Integer aid, Pageable pageable);

    // 3. 使用元素SQL语句，根据文章id分页查询Discuss评论集合
    @Query(value = "SELECT * FROM t_comment WHREE a_Id = ?1", nativeQuery = true)
    List<Discuss> getDiscussPaged2(Integer aid, Pageable pageabl);

    // 4.根据评论id修改评论作者author
    @Transactional
    @Modifying
    @Query("UPDATE t_comment c SET c.author = ?1 WHERE c.id = ?2")
    int updateDiscuss(String author, Integer id);

    // 5.根据评论id删除评论
    @Transactional
    @Modifying
//    @Query("DELETE t_comment c WHERE c.id = ?1")
    @Query("DELETE FROM t_comment c WHERE c.id = ?1")
    int deleteDiscuss(Integer id);
}
