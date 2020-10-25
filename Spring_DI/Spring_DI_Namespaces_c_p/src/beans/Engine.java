package beans;

public class Engine {
	private String model;
	private Engine(String model)
	{
		this.model = model;
		System.out.println("Engine created");

	}

	public String getModel() {
		return model;
	}

}
