package com.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Employee;

public class Test {
public static void main(String[] args)
{
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/config/bean.xml");
	Employee e=(Employee)ac.getBean("e");
	System.out.println(e);;
	
//beanFactory
	
	Resource r=new ClassPathResource("com/config/bean.xml");
	BeanFactory bf=new XmlBeanFactory(r);
	Employee e1=(Employee) bf.getBean("e");
	System.out.println(e1);
	
}
}
