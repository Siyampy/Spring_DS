package services;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import org.springframework.cglib.proxy.MethodProxy;

import business.Bank;

public class LogAroundService implements MethodInterceptor {
@Override
public Object invoke(MethodInvocation arg0) throws Throwable {
Log l=LogFactory.getLog(Bank.class);
l.info("Before deposit");
Object ret=arg0.proceed();
l.info("After deposit");
	return ret;
}

}
