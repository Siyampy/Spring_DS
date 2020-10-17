package services;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.cglib.proxy.MethodProxy;

import business.Bank;

public class LogInExceptionService implements ThrowsAdvice 
{

	public void afterThrowing(Exception e)
	{
	
		Log l=LogFactory.getLog(Bank.class);
		l.info("In case of Exception in Deposit:"+e.getMessage());
	}

}
