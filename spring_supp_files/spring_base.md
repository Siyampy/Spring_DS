package beans;
public class Test
{
	public void hello()
	{
	System.out.println("Hello World");
		}
}

-------------------------------------------------------------
spring.xml (in resources package)
====================
dtd/xsd spring-beans.jar(org.springframework.core.factory.xml.spring-beans-)

<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
			"https://www.springframework.org/dtd/spring-beans-2.0.dtd">
<beans>
<bean id="t" class="beans.Test">
</bean>
</beans>
--------------------------------------------


package test;
public class Client
{
public static void main(string[] args)
{
//Find xml source
Resource r= new ClassPathResource("resources/spring.xml");
//Load xml into container
BeanFactory beanFactory=new XmlBeanFactory(r);
//Create test class object
Test t=(Test)beanFactory.getBean("t");

// Call the bussiness class
t.hello();
}
	
}