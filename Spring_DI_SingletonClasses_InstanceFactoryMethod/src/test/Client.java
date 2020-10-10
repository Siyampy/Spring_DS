package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
//	Here we are making independent Cars and there is no dependancy betweent he cars	
	Car c= (Car) context.getBean("c");
	Car c2= (Car) context.getBean("c");
	System.out.println(c==c2);
	c.drive();

	}
}
