package basicinputoutput.seatingarangement;

import java.util.Scanner;

public class Arrangement {
public static String seat_position(int p)
{
	if(p==2 || p==5)
	{
		return "MS";
	}
	else
	{
		if (p==4 || p==3) {
			return "AS";
			
		} else {
			return "WS";

		}
	}
	
}
	public static void main(String[] args) {
		
		int t,opp_seat,next_row,row,result,position;
		int[] n;
		Scanner s= new Scanner(System.in);
		t=s.nextInt();
		n= new int[t];
		
//		To get the inputs for the testcase
		
		for (int i = 0; i < t; i++) {
			n[i]=s.nextInt();			
		}
		
		for (int i = 0; i < t; i++) {
			result=opp_seat=next_row=row=0;
			row=n[i]/6;
			position=n[i]%6;
			
			if(n[i]%6!=0)
			{
				row++;
			}
			if((row%2)==0)
			{
				next_row=row-1;
				if(n[i]%6==0)
				{
					opp_seat=(next_row*6)-(6 -position)+1;
				}
				else
				{
					opp_seat=(next_row*6)-(position)+1;
				}
			}
			else
			{
				next_row=row+1;
				if(n[i]%6==0)
				{
					opp_seat=(next_row*6)-(6 -position)+1;
				}
				else
				{
					opp_seat=(next_row*6)-(position)+1;
				}
				
			}
			
			System.out.println(opp_seat+" "+ seat_position(opp_seat%6));
			
			
		}	
		
		
	}

}
