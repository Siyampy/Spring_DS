package beans;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

public class Test  {
	
private String driver,url,username; 
Properties prop = null;
private Connection con;
public void setDriver(String driver) {
	this.driver = driver;
}
public void setUrl(String url) {
	this.url = url;
}
public void setUsername(String username) {
	this.username = username;
}
//	@Override
	@PreDestroy
	public void mydestroy() throws Exception {
		// TODO Auto-generated method stub
		con.close();
		System.out.println("COnnection Closed");
		
	}

//	@Override
	@PostConstruct
	public void myinit() throws Exception {
		// It executes after the properties has been set for the 
		try (InputStream input = new FileInputStream("src/resources/Creds.properties")) {
            prop = new Properties();
            // load a properties file
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	    String decrypted=AES.decrypt(prop.getProperty("pswEnc"), prop.getProperty("secretKey"));
		Class.forName(driver);
		con=DriverManager.getConnection(url, username, decrypted);
		System.out.println("Connection Opened");
		
	}
	public void save(int id, String name) throws SQLException
	{
		PreparedStatement ps=con.prepareStatement("insert into category values(?,?)");
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.executeUpdate();
		System.out.println("Insertion Success");
		
	}
	public void delete(int id) throws SQLException
	{
		PreparedStatement ps=con.prepareStatement("delete from category where cid=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("Deletion Success");
	}

}
