/**
 * 
 * The Factory class that is been used to generate the other class objects.
 * 
 * 
 * 1) A static factory method that returns instance of its own class. It is used in singleton design pattern.
	2) A static factory method that returns instance of another class. It is used instance is not known and decided at runtime.


 */
package beans;
public class CarFactory
{
//	Static Factory
	
	private static String carName;
	public static Car getCar()throws Exception
	{
		return (Car)Class.forName(carName).newInstance();
	}
//	public static Car getObject()throws Exception
//	{
//		return (Car)Class.forName(carName).newInstance();
//	}
	public static String getCarName() {
		return carName;
	}
	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}

}
