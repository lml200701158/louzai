package com.java.annotation.spring.bean.fileconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:applicationContext.xml")
public class ImportResourceTest {
    @Value("${jdbc.shop.url}")
    private String url;

    @Value("${jdbc.shop.username}")
    private String userName;

    @Value("${jdbc.shop.password}")
    private String passWord;

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertySourceTest.class);
        PropertySourceTest connection = context.getBean(PropertySourceTest.class);
        System.out.println(connection.toString());
    }
}
