package overriding;

import java.io.IOException;

public class B extends A{
	public void name() throws IOException{
System.out.println("B");
}
public static void main(String[] args) {
//	new B().name();
	for (Object obj : new B().getClass().getMethods()) 
	{
		System.out.println(obj);
	}
	
	
}
}
