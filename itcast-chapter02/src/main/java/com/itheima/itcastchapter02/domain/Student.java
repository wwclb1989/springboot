package com.itheima.itcastchapter02.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class Student {

    @Value("${person.id}")
    private int id;

    @Value("${person.name}")
    private String name;

    private List hobby;

    private String[] family;

    private Map map;

    private Pet pet;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", family=" + Arrays.toString(family) +
                ", map=" + map +
                ", pet=" + pet +
                '}';
    }
}
