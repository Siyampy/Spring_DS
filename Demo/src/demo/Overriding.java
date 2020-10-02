package demo;

import java.util.function.Function;

public class Overriding {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Vehicle obj = new Vehicle();//creating object  
//		obj.run();//calling method 
		 new Bike2().run();
		 Function i=x->((int)x+10);
		 System.out.println(i.apply(10));

	}

}
//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
abstract class Vehicle
{  
//defining a method  
void run()
{System.out.println("Vehicle is running");} 
 abstract void run1();
} 

//Creating a child class  
class Bike2 extends Vehicle
{  
//defining the same method as in the parent class  
void run(){System.out.println("Bike is running safely");}
void run1(){System.out.println("Bike is running safely");}  



 
}  