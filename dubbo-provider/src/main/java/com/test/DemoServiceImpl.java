package com.test;

import org.springframework.stereotype.Service;

/**
 * Created by Oliver on 2018/3/28.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {

        return name;
    }
}
