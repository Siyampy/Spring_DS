package basicinputoutput.togglestring;

import java.util.Scanner;

public class ToggleString {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in );
	String s = sc.nextLine();
	StringBuffer sb= new StringBuffer("");
	for (int i = 0; i < s.length(); i++) 
	{
		char c=s.charAt(i);
		if(Character.isUpperCase(c))
		{
			sb.append(Character.toLowerCase(c));
		}
		else
		{
			sb.append(Character.toUpperCase(c));
		}
		
	}
	System.out.println(sb);
}
}
