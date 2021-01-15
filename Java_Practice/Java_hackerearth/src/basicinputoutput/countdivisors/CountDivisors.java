package basicinputoutput.countdivisors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountDivisors {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer num= new StringTokenizer(br.readLine());
	int l,r,k,e;
	e=0;
	l=Integer.parseInt(num.nextToken());
	r=Integer.parseInt(num.nextToken());
	k=Integer.parseInt(num.nextToken());
	if(l%k==0&&r%k==0)
	{
		e++;
	}
	else
	{
		
		if(l%k==0||r%k==0)
		{
			e++;
			
		}
	}
	System.out.println(((r-l)/k)+e);
	
	
}
}
