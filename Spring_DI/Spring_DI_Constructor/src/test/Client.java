package test;
//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Test;

public class Client
{
public static void main(String[] args)
{
ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
//BeanFactory context1 = new ClassPathXmlApplicationContext("resources/spring.xml");

System.out.println("Before creating object");
Test t=(Test)context.getBean("t",new String());
Test t1=(Test)context.getBean("t1",new String());
t.hello();
t1.hello();
((ConfigurableApplicationContext)context).close();
}
	
}