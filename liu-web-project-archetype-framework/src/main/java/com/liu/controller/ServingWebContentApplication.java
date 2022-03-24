package com.liu.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//import com.liu.dao.impl.SourceDaoImpl;
//import com.liu.dao.impl.SpringJDBCApplication;
//import com.liu.pojo.Source;
	
/**
 * 
 * @author 刘老师
 * 
 * - 源码请所有同学合理使用，禁止非学习用途。
 * - 参照源码多想多练多Debug，杜绝无脑Copy！
 * - 有问题找学委统一汇总，课堂答疑，也可到办公室问我。
 * - 小红书|微信视频号 @老刘编程 三连到位，禁止下次一定！
 *
 */
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
