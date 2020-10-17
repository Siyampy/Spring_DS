package test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Test;

public class Client
{
public static void main(String[] args)
{
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
System.out.println("Before creating object");
Test t=(Test)context.getBean("t");
Test t1=(Test)context.getBean("t");

System.out.println(t==t1);
t.hello();
context.close();
}
	
}