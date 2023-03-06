package org.example.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCtest {
    public static void main(String[] args) {
        //1.配置文件路径
        String xmlPath="/applicationContext.xml";
        //2.创教Spring核心容器
        ApplicationContext ac=new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao=(UserDao) ac.getBean("userDao");
        userDao.say();
    }
}
