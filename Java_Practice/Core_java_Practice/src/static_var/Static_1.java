package static_var;
class Static_2
{
}
public class Static_1 
{
	static int x=10;
	int y=20;
	public static void main(String[] args) 
	{
		Static_1 s1=new Static_1();
		s1.x=888;
		s1.y=999;
		Static_1 s2=new Static_1();
		s2.x=889;
		s2.y=998;
		System.out.println(s2.y);
	}
}
