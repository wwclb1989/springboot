package com.itheima.itcastchapter03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.itheima.itcastchapter03.mapper"})
@SpringBootApplication
public class ItcastChapter03Application {

    public static void main(String[] args) {
        SpringApplication.run(ItcastChapter03Application.class, args);
    }

    /**
     * 最痛的莫过于一厢情愿的珍惜
     * 如果是这样
     * 那就让我放弃
     * 放弃那冰冷的忧伤
     * 放弃那理不清的思绪
     * 尘封那弱不禁风的诺言
     * 放弃那珍藏已久的感情
     * 让那颗脆弱的心重新属于自己
     * 平行线固然默契
     * 但默契的背后
     * 是永恒的距离
     * 人生是一条随时改道的河流
     * 只有大海是终极不变的命运
     * 选择爱你
     * 选择一种无法抗拒的宿命
     * 把所有的结果
     * 留给时间与风去证明
     */
}
