package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2018/1/10.
 */
public class MyUtils {
    private static ApplicationContext context;
    public static ApplicationContext getContext(){
        if(context==null){
            context=new ClassPathXmlApplicationContext("bean.xml");
        }
        return context;
    }
}
