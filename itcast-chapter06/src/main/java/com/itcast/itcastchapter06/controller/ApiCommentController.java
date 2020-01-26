package com.itcast.itcastchapter06.controller;

import com.itcast.itcastchapter06.domain.Comment;
import com.itcast.itcastchapter06.service.ApiCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiCommentController {

    @Autowired
    private ApiCommentService apiCommentService;

    @GetMapping("/get/{id}")
    public Comment findById(@PathVariable("id") int comment_id) {
        Comment comment = apiCommentService.findById(comment_id);
        return comment;
    }


    @GetMapping("/update/{id}/{author}")
    public Comment updateComment(@PathVariable("id") int comment_id, @PathVariable("author") String author) {
        Comment comment = apiCommentService.findById(comment_id);
        comment.setAuthor(author);
        Comment updateComment = apiCommentService.updateComment(comment);
        return updateComment;
    }

    @GetMapping("/delete/{id}")
    public void deleteComment(@PathVariable("id") int comment_id) {
        apiCommentService.deleteComment(comment_id);
    }

}
