package org.tingsinghua.chapter05mybatismultidatasource.mapper2;

import org.tingsinghua.chapter05mybatismultidatasource.domain.Book;

import java.util.List;

public interface BookMapper2 {
    List<Book> getAllBooks();
}
