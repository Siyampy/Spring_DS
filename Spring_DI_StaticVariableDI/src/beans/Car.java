package beans;

public class Car 
{
	private static String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Car.name = name;
	}
	public void carInfo()
	{
		System.out.println("Car name:"+name);
	}

}
