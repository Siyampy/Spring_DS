package beans;

public class Test {
	private String gender;
	private String name;
	private int age;	
public void setGender(String gender)
{
	this.gender = gender;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
	public void hello()
	{
		System.out.println("Hello "+name +" is a "+gender+" and he is "+age+" years old");
	}
	

}
