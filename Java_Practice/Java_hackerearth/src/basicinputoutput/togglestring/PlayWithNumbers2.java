package basicinputoutput.togglestring;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;
public class PlayWithNumbers2
{
	public static void main(String[] args)
	{
	    long N,Q,L,R;
		Scanner sc=new Scanner(System.in);
		N=sc.nextLong();
		Q=sc.nextLong();
		long[] n=new long[(int) N];
		for (long i = 0; i < N; i++) 
		{
			n[(int) i]=sc.nextLong();
		}
		for (long i = 0; i < Q; i++) 
		{
			long out=0;
			L=sc.nextLong();
			R=sc.nextLong();
				out= (long)Math.floor(Arrays.stream(LongStream.range(L-1,R).map(k->n[k]).toArray()).average().orElse(Double.NaN));			
			
			System.out.println(out);

		}
	}

}
