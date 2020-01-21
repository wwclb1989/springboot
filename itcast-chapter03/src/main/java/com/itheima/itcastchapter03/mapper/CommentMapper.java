package com.itheima.itcastchapter03.mapper;

import com.itheima.itcastchapter03.domain.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {

    @Select("SELECT * FROM t_comment WHERE id = #{id}")
    Comment findById(Integer id);

    @Insert("INSERT INTO t_comment(content, author, a_id) values (#{content}, #{author}, #{aId})")
    int insertComment(Comment comment);

    @Update("UPDATE t_comment SET content = #{content} WHERE id = #{id}")
    int updateComment(Comment comment);

    @Delete("DELETE FROM t_comment WHERE id = #{id}")
    int deleteComment(Integer id);

}
