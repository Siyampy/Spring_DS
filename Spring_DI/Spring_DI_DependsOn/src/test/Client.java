package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
	((ConfigurableApplicationContext)context).close();
	}

}
