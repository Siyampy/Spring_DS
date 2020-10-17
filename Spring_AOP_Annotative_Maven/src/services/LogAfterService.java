package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import business.Bank;
@ComponentScan
@Aspect
public class LogAfterService 
{
	@After("execution(* business.Bank.balance(*))")
	public void after(JoinPoint jp)
	{
	System.out.println("Executing after the service ");
	}
	
	@AfterReturning(pointcut = "execution(* business.Bank.balance(*))",returning = "result")
	public void after(JoinPoint jp,Object result)
	{
	System.out.println("Executing after returning result from the service "+ result);
	}
}
