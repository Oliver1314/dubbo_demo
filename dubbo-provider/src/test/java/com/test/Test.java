package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Oliver on 2018/3/28.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
