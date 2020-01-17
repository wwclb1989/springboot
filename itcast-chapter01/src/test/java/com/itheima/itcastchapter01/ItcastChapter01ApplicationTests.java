package com.itheima.itcastchapter01;

import com.itheima.itcastchapter01.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItcastChapter01ApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    public void helloControllerTest() {
        String hello = helloController.hello();
        System.out.println(hello);
    }

    @Test
    void contextLoads() {
    }

}
