package basicinputoutput.minnumberofstps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinSteps {
public static void main(String[] args) throws IOException 
{
	int n;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(br.readLine());
	StringTokenizer st= new StringTokenizer(br.readLine()," ");
	int[] a=new int[n];
	int[]b=new int[n];
	int count,min,ii=0;min=5000;
	while (st.hasMoreTokens()) 
	{
		a[ii]=Integer.parseInt(st.nextToken());
		
		if(min>a[ii])
		{
			min=a[ii];
		}
		ii++;
	}
	st= new StringTokenizer(br.readLine()," ");
	ii=0;
	while (st.hasMoreTokens()) 
	{
		b[ii]=Integer.parseInt(st.nextToken());	
		ii++;
	}
	count=0;
	
	break1:
		 for (int i = 0; i < n; i++) 
		 {
			 while (a[i]> min && b[i]!=0) 
			 {
				 a[i]=a[i]-b[i];
				 count+=1;
				 if(a[i]<0)
				 {
					 break break1;
				 }
				
			}
			 if(a[i]<min)
			 {
				 min=a[i];
			 }
			 
			
		}
	if(a[0]!=a[n-1])
	{
		System.out.println(-1);
	}
	else
	{
		System.out.println(count);
	}
	
}
}
