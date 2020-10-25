package beans;
public class Test
{
	//Spring can access private cons also
//	But using Class.forName() explicitly can't but by changing access of cons dynamically we can change access of cons and then we can callit.
	private Test() {
		System.out.println("Test object is been created");
	}
	public void hello()
	{
	System.out.println("Hello World using the Spring 5");
		}
}