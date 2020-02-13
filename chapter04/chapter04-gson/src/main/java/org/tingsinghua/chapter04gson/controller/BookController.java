package org.tingsinghua.chapter04gson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tingsinghua.chapter04gson.domain.Book;

import java.util.Date;

@Controller
public class BookController {

    @GetMapping("/book")
    @ResponseBody
    public Book book() {
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
}
