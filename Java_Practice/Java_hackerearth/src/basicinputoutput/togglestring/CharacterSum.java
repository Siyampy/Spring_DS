package basicinputoutput.togglestring;

import java.util.Scanner;

public class CharacterSum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s= sc.nextLine();
	int l=0;
	for (int i = 0; i < s.length(); i++) 
	{
		int n=s.charAt(i);
		l+=(n-96);
		
		
	}
	System.out.println(l);
	}
}
