package services;

import java.lang.reflect.Method;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import business.Bank;
@ComponentScan

@Aspect
public class LogAroundService 
{
	@Around("execution(* business.Bank.deposit(*,*))")
	public void around(ProceedingJoinPoint jp) throws Throwable
	{
	System.out.println("Executing around before  the service ");
	jp.proceed();
	System.out.println(jp.getThis().toString());
	System.out.println("Executing around after  the service ");
	
	}
}
