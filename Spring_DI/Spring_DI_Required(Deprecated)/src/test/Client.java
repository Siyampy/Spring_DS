package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
	Car c1= (Car) context.getBean("cc");
	c1.carInfo();
	}
}
