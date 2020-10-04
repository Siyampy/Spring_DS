package beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
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
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public void carInfo() {
		System.out.println(e2.getModel());
		System.out.println("Name:"+name+"\n Id:"+id);			
	}

}
