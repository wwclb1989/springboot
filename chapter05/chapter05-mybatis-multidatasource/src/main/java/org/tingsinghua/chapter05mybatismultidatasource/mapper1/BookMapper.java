package org.tingsinghua.chapter05mybatismultidatasource.mapper1;

import org.tingsinghua.chapter05mybatismultidatasource.domain.Book;

import java.util.List;

public interface BookMapper {

    List<Book> getAllBooks();
}
