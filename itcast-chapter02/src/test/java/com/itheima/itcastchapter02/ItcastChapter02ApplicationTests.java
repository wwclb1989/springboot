package com.itheima.itcastchapter02;

import com.itheima.itcastchapter02.domain.MyProperties;
import com.itheima.itcastchapter02.domain.Person;
import com.itheima.itcastchapter02.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ItcastChapter02ApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private Student student;

    @Autowired
    private MyProperties myProperties;

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${tom.description}")
    private String description;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    void studentTest() {
        System.out.println(student);
    }

    @Test
    void myPropertiesTest() {
        System.out.println(myProperties);
    }

    @Test
    void iocTest() {
        System.out.println(applicationContext.containsBean("myService"));
    }

    @Test
    void placeholderTest() {
        System.out.println(description);
    }
}
