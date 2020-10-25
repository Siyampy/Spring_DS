/**
 * 
 * The Factory class that is been used to generate the other class objects.
 * 
 * 
 * 1) A static factory method that returns instance of its own class. It is used in singleton design pattern.
	2) A static factory method that returns instance of another class. It is used instance is not known and decided at runtime.


 */
package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean
{
	private String carName;
	

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		Car c=(Car)Class.forName(carName).newInstance();
		return c;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	


}
