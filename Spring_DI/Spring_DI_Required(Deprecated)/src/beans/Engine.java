package beans;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	private String model;
	private Engine()
	{
		System.out.println("Engine created");

	}

	public String getModel() {
		return model;
	}
	@Required
	public void setModel(String model) {
		this.model = model;
	}

}
