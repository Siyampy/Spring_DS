package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.Bank;
//@Configuration
//@EnableAspectJAutoProxy
public class Client 
{
	public static void main(String[] args) {
ConfigurableApplicationContext cfg= new ClassPathXmlApplicationContext("resources/spring.xml");
Bank bproxy=(Bank) cfg.getBean("b");
System.out.println(bproxy.balance("SBI123"));
		System.out.println(bproxy.deposit("SBI123", 3000));
//		System.out.println(amount);
		cfg.close();
		
	}
}
