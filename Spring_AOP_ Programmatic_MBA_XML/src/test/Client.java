package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;
import services.LogBeforeService;

public class Client {
	public static void main(String[] args) {
ConfigurableApplicationContext cfg= new ClassPathXmlApplicationContext("resources/spring.xml");
Bank bproxy=(Bank) cfg.getBean("proxy");
		int amount=bproxy.deposit("SBI1234", 3000);
		System.out.println(amount);
	}
	
	

}
