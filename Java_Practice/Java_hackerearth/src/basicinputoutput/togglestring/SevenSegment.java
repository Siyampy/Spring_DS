package basicinputoutput.togglestring;

import java.util.Scanner;

public class SevenSegment {
	public static void main(String[] args) 
	{
		int[] num= {6,2,5,5,4,5,6,3,7,6};
		int out_count=0;
		String out="";
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) 
		{
			out="";
			out_count=0;
			String in=sc.nextLine();
		    for (int j = 0; j <in.length() ; j++) 
		    {
		    	out_count+=num[Character.getNumericValue(in.charAt(j))];
				
		    }    
		    if(out_count%2==0)
		    {
		    	for (int j = 0; j < out_count; j+=2) 
		    	{
					out=out+"1";
				}
		    }
		    else
		    {
		    	out=out+"7";
		    	out_count-=3;
		    	for (int j = 0; j < out_count; j+=2) 
		    	{
					out=out+"1";
				}
		    }
//		    System.out.println(out_count);
		    System.out.println(out);
			
			
		}
	}

}
