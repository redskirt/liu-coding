package com.liu.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.liu.dao.impl.SourceDaoImpl;
import com.liu.dao.impl.SpringJDBCApplication;
import com.liu.pojo.Source;

@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) {
    	
        SpringApplication.run(ServingWebContentApplication.class, args);
    	
//    	try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringJDBCApplication.class)) {
//			SourceDaoImpl sourceDao = (SourceDaoImpl) context.getBean("sourceDao");
//			
//			List<Source> list_1 = sourceDao.queryList();
//			list_1.forEach(System.out::println);
//			
//			Source o = new Source();
//			o.setName("123");
//			o.setPrice(12);
//			o.setBuyDate(Date.valueOf("2011-1-23"));
//			o.setType("12");
//			sourceDao.add(o);
//			
//			
//			System.out.println(sourceDao.queryById(1));
//			System.out.println(sourceDao.queryById(6));
//			
//		} catch (BeansException e) {
//			e.printStackTrace();
//		}
    	
    }
}
