package basicinputoutput.minumumsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinumumSum {
public static void main(String[] args) throws IOException 
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//	StringTokenizer st= new StringTokenizer(br.readLine()," ");
//	int n1=st.nextToken()
	int[] arr= {3,-1,-2};
	int k=2;
	int n=arr.length;
	long out=0;
	int i,j;
	for (i=j = 0;  i< n; i++) 
	{
		if (arr[i]<0) 
		{
		continue;	
		}
		while (i-j>k) 
		{
			j++;			
		}
		
		while (arr[i]!=0 && (i+k)>=min(n-1,j))
		{
			if(arr[j]>0)
			{
				j++;
				continue;
			}
			int x=min(arr[i],Math.abs(arr[j]));
			arr[i]-=x;
			arr[j]+=x;
			if(arr[j]>=0)
			{
				j++;
			}
			
		}
		
	}
	for (int j2 = 0; j2 < arr.length; j2++) {
		out+=Math.abs(arr[j2]);
		
	}
System.out.println(out);
//	return out;
}

private static int min(int i, int j) 
{
	return i>j?j:i;
}
}
