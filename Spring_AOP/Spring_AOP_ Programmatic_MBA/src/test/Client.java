package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogBeforeService;

public class Client {
	public static void main(String[] args) {
//		Target
		Bank b= new Bank();
		//Advice 
		LogBeforeService lbs=new LogBeforeService();
		//Adding Target + Advice to the proxy.
		ProxyFactoryBean pfb= new ProxyFactoryBean();
//		System.out.println("pfb");
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		// Get generated proxy
		Bank bproxy=(Bank)pfb.getObject();
		int amount=bproxy.deposit("SBI123", 3000);
		System.out.println(amount);
	}
	
	

}
