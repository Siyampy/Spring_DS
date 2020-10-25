package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Car {
	private String name;
	
	private Engine engine;
	private Car() {
		System.out.println("Car created");
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void carInfo() {
		System.out.println("Car :"+name);
		System.out.println("Model :"+engine.getModel());	
	}

}
