package basicinputoutput.togglestring;

import java.util.Scanner;

public class Find_Product 
{
public static void main(String[] args) 
{
	int n,constant=(int)Math.pow(10, 9)+7;
	long answer;
	
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	int[] input = new int[n];
	answer=1;
	for (int i = 0; i < n; i++) 
	{
		input[i]=sc.nextInt();
		answer=(answer*input[i])%(constant);
	}
	System.out.println(answer);
	

	
	
}
}
