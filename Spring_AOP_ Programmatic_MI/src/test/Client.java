package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.core.log.LogAccessor;

import business.Bank;
import services.LogAroundService;

public class Client {
	public static void main(String[] args) {
//		Target
		Bank b= new Bank();
		//Advice 
	LogAroundService lbs=new LogAroundService();
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
