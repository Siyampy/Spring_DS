package beans;

public class Engine {
	private String model;
	private Engine()
	{
		System.out.println("Engine created");

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
