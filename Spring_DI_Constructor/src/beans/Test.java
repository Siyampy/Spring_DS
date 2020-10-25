package beans;

public class Test {
	private String gender;
	private String name;
	private String email;
	private int age;
	private Test(String name,String gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	private Test(String email)
	{
		this.email=email;
	}
//private Test(int age)
//{
//	this.age=age;
//}
	public void hello()
	{
		System.out.println("Hello "+name +" is a "+gender+" and he is "+age+" years old His Email is "+email);
	}
	

}
