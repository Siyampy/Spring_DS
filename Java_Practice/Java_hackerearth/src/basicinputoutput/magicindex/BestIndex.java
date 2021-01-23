package basicinputoutput.magicindex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BestIndex {
public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer num= new StringTokenizer(br.readLine());
	int max,vo,k,leftout;
	int n,sum=max=0;
	n= Integer.parseInt(num.nextToken());
	StringTokenizer arr= new StringTokenizer(br.readLine());
	int[] array=new int[n];
	for (int i=0; i<n;i++) 
	{
	array[i]=Integer.parseInt(arr.nextToken());	
	}
	
	max=Integer.MIN_VALUE;
	for (int i = 0; i < array.length; i++) 
	{
		vo=1;
		k=i;
		sum=0;
		leftout=array.length-i;
		while (leftout>0) 
		{
			for (int j = 0; j < vo; j++) 
			{
				sum+=array[k++];
			}
			vo++;
			leftout-=vo;
		}
		if (sum>max) {
			max=sum;
			
		}
		
	}
	System.out.println(max);
	
	
}
}
