package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Person bean = (Person) context.getBean("person01");
        System.out.println(bean);
    }
}
