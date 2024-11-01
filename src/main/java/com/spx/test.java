package com.spx;

import com.spx.dao.TestDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao tt = (TestDao) appCon.getBean("testDao");
        tt.sayHello();


    }
}
