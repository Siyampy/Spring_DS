package beans;

public class Bus {
	private static String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
	Bus.name = name;
	}
	public void carInfo()
	{
		System.out.println("Bus name:"+name);
	}

}
