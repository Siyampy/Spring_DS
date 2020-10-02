package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client
{
public static void main(String[] args)
{
//Find xml source
Resource r= new ClassPathResource("resources/spring.xml");
//Load xml into container
@SuppressWarnings("deprecation")
//lazy container and creates object on demand
BeanFactory beanFactory=new XmlBeanFactory(r);
//Eager container and it creates object on loading itself.
ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");


//Create test class object
System.out.println("Before creating object");
Test t=(Test)context.getBean("t");
Test t1=(Test)context.getBean("t");
Test t2=(Test)context.getBean("t");

//Only one object is been created even if we create multiple times as like the Servlet object on starting 
//only one servlet object is been created and so it is singleton 
System.out.println(t==t1);
//Here both the object is refering to the single class object

// Call the business class
t.hello();
}
	
}