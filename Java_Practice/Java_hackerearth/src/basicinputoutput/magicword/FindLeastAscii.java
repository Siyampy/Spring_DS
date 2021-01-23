package basicinputoutput.magicword;

import java.util.Arrays;

public class FindLeastAscii 
{
	public static void main(String[] args) 
	{
		int[] primes= {67,71,
				73,
				79,
				83,
				89,
				97,
				101,
				103,
				107,
				109,
				113,
		};
		int diff,diff1,prime = 0,number=(int)'_';
		diff=Integer.MAX_VALUE;
		if(Arrays.binarySearch(primes,number)<0)
		{
			for (int i : primes) 
			{
				diff1=Math.abs(i-number);
				if(diff1<diff)
				{
					diff=diff1;
					prime=i;
				}
			}
			
		}
		else
		{
			prime=primes[Arrays.binarySearch(primes,number)];
		}
		System.out.println(prime);

	}
}
