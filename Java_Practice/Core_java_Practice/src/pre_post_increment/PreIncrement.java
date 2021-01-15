package pre_post_increment;

public class PreIncrement 
{
public static void main(String[] args) {
	int a=10;
	int b=10;
	int c =10;
	int bb=  ++a +a++ +a++ + a++;
	System.out.println(bb);
	System.out.println(a);
	System.out.println(Float.POSITIVE_INFINITY *Float.NaN);
}
}
