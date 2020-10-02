package beans;

public class Car {
	private String[] name;
	private Engine[] engine;
//	private Car() {
//		System.out.println("Car created");
//	}
	public void setName(String[] name) {
		this.name = name;
	}
	
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void carInfo() {
	for(String name:name)
	{
		System.out.println(name);
	}
	System.out.println("--------------------------------------------------");
	for(Engine e:engine)
	{
		System.out.println(e.getModel());
	}
			
	}

}
