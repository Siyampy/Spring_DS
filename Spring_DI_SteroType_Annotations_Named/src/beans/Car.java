package beans;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Named
public class Car {	
/*
 * To Automatically perform DI  we use @Component annoataion 
 * It is used only for the secondary types and if any primary types are there then inject manually
 * The container creates object of Annotated compnent annotation and the @Autowired annotation injects the dependancy.
 *  
 *  
 *  Here Car object created automatically and engine object injected automatically
 *  Only Secon types are useful and primary types are not created in this method
 *  */	
	@Autowired
	private Engine e2;
	public void carInfo() {
		System.out.println(e2.getModel());
		System.out.println("Engine Model: "+e2.getModel());			
	}

}
