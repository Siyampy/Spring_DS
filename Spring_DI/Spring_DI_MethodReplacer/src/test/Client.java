package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Client
{
public static void main(String[] args)
{
ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
Bank b=(Bank)context.getBean("b");
b.CalInt();
b.deposit();
b.withdraw();
System.out.println(b.getClass().getCanonicalName());


((AbstractApplicationContext) context).close();
}	
}