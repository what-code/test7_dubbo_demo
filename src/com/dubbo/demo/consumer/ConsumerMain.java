package com.dubbo.demo.consumer;

import com.dubbo.demo.HelloService;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext classPathXmlApplicationContext = 
        		new FileSystemXmlApplicationContext("D:\\workspace\\test7_dubbo\\src\\conf\\application-context-consumer.xml");
        classPathXmlApplicationContext.start();

        HelloService helloService = (HelloService) classPathXmlApplicationContext.getBean("helloService");
        String world = helloService.hello("World,2016!");

        System.out.println("=====================================");
        System.out.println(world);
        System.out.println("=====================================");
    }
}
