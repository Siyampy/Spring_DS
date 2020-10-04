package beans;

public class Engine {
	private String model;
	private Engine()
	{
		System.out.println("Engine created");

	}
	private Engine(String model)
	{System.out.println("engine model initialized using cons");
		this.model = model;
		System.out.println("Engine param created");

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		System.out.println("engine model initialized using setter");

		this.model = model;
	}

}
