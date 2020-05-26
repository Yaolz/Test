package com.gs.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/config/spring-*.xml"})
public class BaseTest {
     System.out.println("test1")
     System.out.println("test2")
     System.out.println("test33")
}
