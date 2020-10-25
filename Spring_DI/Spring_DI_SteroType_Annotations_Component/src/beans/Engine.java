package beans;

public class Engine {
	private String model;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		System.out.println("engine model initialized using setter");
		this.model = model;
	}

}
