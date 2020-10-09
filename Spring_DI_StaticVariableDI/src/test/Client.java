package test;
import org.springframework.beans.factory.config.MethodInvokingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
public class Client {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("resources/car-engine.xml");
//	ApplicationContext context = new ClassPathXmlApplicationContext("resources/car.xml","resources/engine.xml");
	Car c= (Car)context.getBean("c");
	c.carInfo();
	Bus b= (Bus)context.getBean("b");
	b.carInfo();
	((ConfigurableApplicationContext)context).close();
	}
}
