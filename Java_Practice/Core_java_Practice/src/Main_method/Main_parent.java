package Main_method;

public class Main_parent {
	public static void main(String[] args) {
		System.out.println("Parent main method");
		
	}
	public static void main(int[] args) {
		
	}

}
class Main_child extends Main_parent
{
	
	public static void main(String[] args) {
		System.out.println("Child main method");
		
	}
}
