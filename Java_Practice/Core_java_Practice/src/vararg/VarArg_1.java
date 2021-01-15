package vararg;

public class VarArg_1 
{
	public static void m1(int... x)
	{
		System.out.println();
		for (int i : x) {
			System.out.println(i);
			
		}
		
	}
	static void m2(int[][]... x)
	{
		for (int[][] i : x) {
		for (int[] js : i) {
			for (int js2 : js) {
				System.out.println(js2+1);
				
			}
		}
		}
	}
public static void main(String[] args)
{
	m1(new int[] {10,20,30});
	m1(110);
	m1();
	m1();
	m2(new int[3][3][3]);
	
	
}
}
