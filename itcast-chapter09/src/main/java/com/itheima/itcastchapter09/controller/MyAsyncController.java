package com.itheima.itcastchapter09.controller;

import com.itheima.itcastchapter09.service.MyAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
public class MyAsyncController {

    @Autowired
    private MyAsyncService myService;

    @GetMapping("/sendSMS")
    public String sendSMS() throws Exception {
        long startTime = System.currentTimeMillis();
        myService.sendSMS();
        long endTime = System.currentTimeMillis();
        System.out.println("主流程耗时：" + (endTime - startTime));
        return "success";
    }


    @GetMapping("/statistics")
    public String statistics() throws Exception {
        long startTime = System.currentTimeMillis();
        Future<Integer> futureA = myService.processA();
        Future<Integer> futureB = myService.processB();
        int total = futureA.get() + futureB.get();
        System.out.println("异步任务数据统计汇总结果：" + total);
        long endTime = System.currentTimeMillis();
        System.out.println("主流程耗时：" + (endTime - startTime));
        return "success";
    }
}
