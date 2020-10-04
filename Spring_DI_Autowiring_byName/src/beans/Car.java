package beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
public class Car {
//	@Autowired
	private Engine engine;
//	private Engine engine1;
//	public void setEngine1(Engine engine1) {
//		this.engine1 = engine1;
//	}

	private int id;
//	@Required
	public void setId(int id) {
		this.id = id;
	}
//	@Required
	public void setName(String name) {
		System.out.println("Car name  initialized using setter");

		this.name = name;
	}
	private String name;
//	public Car()
//	{	
//		System.out.println("Running Car");
//	}	
	public Car(Engine engine)
	{
		System.out.println("Running Car");
		System.out.println("engine initialized using constructor");
		this.engine=engine;
	}

	
	public void setEngine(Engine engine) {
		System.out.println("engine initialized using setter");
		this.engine = engine;
	}

	public void carInfo() {
		System.out.println(engine.getModel());
		System.out.println("Name:"+name+"\n Id:"+id);
	
			
	}

}
