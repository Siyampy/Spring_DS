package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Car;

public class Client
{
public static void main(String[] args)
{
ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
Car c=(Car)context.getBean("c");
//System.out.println(c.myCarEngine().getName());
System.out.println(c.getClass().getCanonicalName());
System.out.println(context.getBean("c1").getClass().getCanonicalName());
System.out.println(context.getBean("c2").getClass().getCanonicalName());


((AbstractApplicationContext) context).close();
}	
}