package test;
import java.sql.SQLException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Test;
//https://mkyong.com/java/java-properties-file-examples/
//https://howtodoinjava.com/java/java-security/java-aes-encryption-example/
//https://www.baeldung.com/java-random-string
public class Client {
	public static void main(String[] args) throws SQLException
	{		
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t=(Test)cap.getBean("cf");
		t.save(6,"Demo");
		t.delete(6);
		cap.close();		
	}
}
