package fastio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlayWithNumbers {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long mean;
//		IT 
		StringTokenizer no_queries=new StringTokenizer(br.readLine()," ");
		int N=Integer.parseInt(no_queries.nextToken());
		int Q=Integer.parseInt(no_queries.nextToken());
		StringTokenizer array=new StringTokenizer(br.readLine()," ");
		long[] prefixSum=new long[N];
		prefixSum[0]=Integer.parseInt(array.nextToken());
		for (int i = 1; i < N; i++) 
		{
			prefixSum[i]=prefixSum[i-1]+Integer.parseInt(array.nextToken());
//			System.out.println(prefixSum[i]);
			
		}
		for (int i = 0; i < Q; i++) 
		{
			StringTokenizer range = new StringTokenizer(br.readLine(), " ");
			int L=Integer.parseInt( range.nextToken() );

			int R=Integer.parseInt( range.nextToken() );
//			Sum of the digits divided by the no of the terms provide the average(mean of the range of integers added
			
			long d=R-L +1;
			if(L>1)
			{
				mean=(prefixSum[R-1]-prefixSum[L-2])/d;
			}
			else
			{
				mean= (prefixSum[R-1])/d;
			}
			System.out.println(mean);
			
			
			
			
		}
		
		
		
		

	}

}
