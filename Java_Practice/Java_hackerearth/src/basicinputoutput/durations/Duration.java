package basicinputoutput.durations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Duration 
{
	public static void main(String[] args) throws IOException 
	{
		 int SH,SM,EH,EM,ST,ET,DIFF;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer num= new StringTokenizer(br.readLine());
		int n=Integer.parseInt(num.nextToken());
		for (int i = 0; i < n; i++) 
		{
			StringTokenizer time= new StringTokenizer(br.readLine());
			SH=Integer.parseInt(time.nextToken());
			SM=Integer.parseInt(time.nextToken());
			EH=Integer.parseInt(time.nextToken());
			EM=Integer.parseInt(time.nextToken());
			ST=SH*60+SM;
			ET=EH*60+EM;
			DIFF=ET-ST;
			
			
			System.out.println((DIFF/60)+" "+(DIFF%60));
			
			
			
		}
		
		
		
	}

}
