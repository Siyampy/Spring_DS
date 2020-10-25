package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("resources/car-engine.xml");
//	ApplicationContext context = new ClassPathXmlApplicationContext("resources/car.xml","resources/engine.xml");
	Car c= (Car)context.getBean("c");
	c.carInfo();
	((ConfigurableApplicationContext)context).close();
	}
}
