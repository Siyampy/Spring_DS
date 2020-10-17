package services;


import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import business.Bank;
@ComponentScan
@Aspect
public class LogBeforeService 
{
	@Before("execution(* business.Bank.balance(*))")
	public void before(JoinPoint jp)
	{
	System.out.println("Executing before the service "+ jp.getSignature());
	}

	

	
	
	
}
