package basicinputoutput.togglestring;

import java.util.Arrays;
//import java.util.fsanner;
import java.util.stream.IntStream;

import fastio.FastReader;

public class PlayWithNumbers {
public static void main(String[] args) {
	int N,Q,L,R;
	FastReader fs=new FastReader();
	
	N=fs.nextInt();
	Q=fs.nextInt();
	int[] n=new int[N];
	for (int i = 0; i < N; i++) 
	{
		n[i]=fs.nextInt();
	}
	for (int i = 0; i < Q; i++) 
	{
		int output=0;
		int out=0;
		L=fs.nextInt();
		R=fs.nextInt();
		for (int j = 0; j < Q; j++) 
		{
			int[] dummy=IntStream.range(L-1,R).map(k->n[k]).toArray();
			out= (int) (Arrays.stream(dummy).sum()/Arrays.stream(dummy).count());			
		}
		System.out.println(out);

	}
}
}
