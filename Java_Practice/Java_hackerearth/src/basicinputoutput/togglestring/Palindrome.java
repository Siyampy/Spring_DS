package basicinputoutput.togglestring;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String sb= "";
		for (int i = s.length()-1; i>=0; i--) 
		{
			sb+=s.charAt(i);
		}
		if(s.equals(sb)) {
			System.out.println("YES");
			
		}
		else {
			System.out.println("NO");
		}
	}

}
