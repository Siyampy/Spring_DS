package beans;

public class Test {
	private String gender;
	private String name;
	private int age;
	private Test(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
	}
private Test(int age)
{
	this.age=age;
}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
	public void hello()
	{
		System.out.println("Hello "+name +"is a "+gender+"and he is "+age+" years old");
	}
	

}
