package basicinputoutput.brickgame;

import java.util.Scanner;

public class SonuSweety {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bool,n= sc.nextInt();
		bool=0;
		for (int i = 1; i < n/2; i++) 
		{
			if (n%i==0 &&((n/i)==3)) 
			{
				bool++;
//				System.out.println("YES");				
			}
			
		}
		if (bool==0)
		{
			System.out.println("NO");
			
		}
		else {
			System.out.println("YES");
		}
		
	}

}
