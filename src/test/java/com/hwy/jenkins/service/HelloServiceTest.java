package com.hwy.jenkins.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

    private HelloService helloService;

    @Before
    public void set(){
        helloService = new HelloService();
    }

    @Test
    public void sayTest(){
        assertEquals(helloService.say("world"), "hello world");
    }
}
