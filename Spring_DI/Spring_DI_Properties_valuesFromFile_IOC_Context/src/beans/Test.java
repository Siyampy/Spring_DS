package beans;

import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class Test {
	private String driver,url,username,pwd,db;
	
	

	public void info()
	 {
		System.out.println("Driver:"+driver);
		System.out.println("User:"+username);
		System.out.println("url:"+url);
		System.out.println("pwd:"+pwd);
		System.out.println("db:"+db);
		
	
	 }



	public String getDriver() {
		return driver;
	}



	public void setDriver(String driver) {
		this.driver = driver;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String getDb() {
		return db;
	}



	public void setDb(String db) {
		this.db = db;
	}

}
