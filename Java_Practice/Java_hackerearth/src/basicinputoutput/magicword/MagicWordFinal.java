package basicinputoutput.magicword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MagicWordFinal {
public static void main(String[] args) throws NumberFormatException, IOException 
{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String word=null;
	StringBuilder sb=new StringBuilder();
	int t,n;
	int diff,diff1,prime = 0;
	diff=Integer.MAX_VALUE;
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
	t= Integer.parseInt(br.readLine());
	for (int j = 0; j < t; j++) 
	{
		sb.setLength(0);
		n=Integer.parseInt(br.readLine());
		word=br.readLine();
		char[] word_int=word.toCharArray();
		for (char c : word_int) 
		{diff=Integer.MAX_VALUE;
			if(Arrays.binarySearch(primes,c)<0)
			{
				for (int i : primes) 
				{
					diff1=Math.abs(i-c);
					if(diff1<diff)
					{
						diff=diff1;
						prime=i;
					}
				}
				
			}
			else
			{
				prime=primes[Arrays.binarySearch(primes,c)];
			}
			sb.append((char)prime);
			
			
			
		}
		System.out.println(sb);
		
		
	}
	
}
}
