package beans;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
public class Car {
	
/*
 * The use of the parameter cons doesn't works for it. please remove the parameterized constructor. 
 *  
 *  */	

	@Qualifier("e3")
	@Autowired
	private Engine e2;

	private int id;
//	@Required
	public void setId(int id) {
		this.id = id;
	}
//	@Required
	public void setName(String name) {
//		System.out.println("Car name  initialized using setter");

		this.name = name;
	}
	private String name;
//	public Car()
//	{	
//		System.out.println("Running Car");
//		System.out.println("using default constructor");
//	}	
//	public Car(Engine engine)
//	{
//		System.out.println("Running Car");
//		System.out.println("engine initialized using constructor");
//		this.engine=engine;
//	}

	
//	public void setEngine(Engine engine) {
//		System.out.println("engine initialized using setter");
//		this.e2 = engine;
//	}

	public void carInfo() {
		System.out.println(e2.getModel());
		System.out.println("Name:"+name+"\n Id:"+id);
	
			
	}

}
