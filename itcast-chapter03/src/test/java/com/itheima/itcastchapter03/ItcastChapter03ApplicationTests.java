package com.itheima.itcastchapter03;

import com.itheima.itcastchapter03.domain.*;
import com.itheima.itcastchapter03.mapper.ArticleMapper;
import com.itheima.itcastchapter03.mapper.CommentMapper;
import com.itheima.itcastchapter03.repository.DiscussRepository;
import com.itheima.itcastchapter03.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class ItcastChapter03ApplicationTests {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private DiscussRepository repository;

    @Autowired
    private PersonRepository personRepository;

    @Test
    void selectComment() {
        Comment comment = commentMapper.findById(1);
        System.out.println(comment);

    }

    @Test
    void selectArticle() {
        Article article = articleMapper.selectArticle(1);
        System.out.println(article);
    }

    // 1. 使用JpaRepository内部方法进行数据操作
    @Test
    void selectDiscuss() {
        Optional<Discuss> optional = repository.findById(1);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
    }

    // 2. 使用方法名关键字进行数据操作
    @Test
    void selectCommentByKeys() {
        List<Discuss> list = repository.findByAuthorNotNull();
        System.out.println(list);
    }

    // 3. 使用@Query注解进行数据操作
    @Test
    void selectCommentPaged() {
        Pageable pageable = PageRequest.of(0, 3);

        List<Discuss> allPaged = repository.getDiscussPaged(1, pageable);
        System.out.println(allPaged);
    }

    // 4. 使用Example封装参数进行数据查询操作
    @Test
    void selectCommentByExample() {
        Discuss discuss = new Discuss();
        discuss.setAuthor("张三");
        Example<Discuss> example = Example.of(discuss);

        List<Discuss> list = repository.findAll(example);
        System.out.println(list);
    }
    @Test
    void selectCommentByExampleMatcher() {
        Discuss discuss = new Discuss();
        discuss.setAuthor("张");
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("author", ExampleMatcher.GenericPropertyMatchers.startsWith());
        Example<Discuss> example = Example.of(discuss, matcher);

        List<Discuss> list = repository.findAll(example);
        System.out.println(list);
    }

    @Test
    void deleteComment() {
        int i = repository.deleteDiscuss(5);
        System.out.println(i);
    }

    @Test
    void savePerson() {
        Person person = new Person("张", "有才");
        Person person2 = new Person("James", "Harden");

        Address address = new Address("北京", "China");
        person.setAddress(address);

        // 创建并添加家庭成员
        List<Family> list = new ArrayList<>();
        Family dad = new Family("父亲", "张良");
        Family mom = new Family("母亲", "李香君");
        list.add(dad);
        list.add(mom);
        person.setFamilyList(list);

        // 向Redis数据库添加数据
        Person save = personRepository.save(person);
        Person save2 = personRepository.save(person2);

        System.out.println(save);
        System.out.println(save2);
    }

    @Test
    void selectPerson() {
        List<Person> list = personRepository.findByAddress_City("北京");
        System.out.println(list);
    }

    @Test
    void updatePerson() {
        Person person = personRepository.findByFirstnameAndLastname("张", "有才").get(0);
        person.setLastname("小明");
        Person update = personRepository.save(person);
        System.out.println(update);
    }

    @Test
    void deletePerson() {
        Person person = personRepository.findByFirstnameAndLastname("张", "小明").get(0);
        personRepository.delete(person);

    }
}
