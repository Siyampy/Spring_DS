package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
//	ApplicationContext context = new ClassPathXmlApplicationContext("resources/car.xml","resources/engine.xml");
	Test t=(Test)context.getBean("t");
	t.info();
	((ConfigurableApplicationContext)context).close();

	}

}
