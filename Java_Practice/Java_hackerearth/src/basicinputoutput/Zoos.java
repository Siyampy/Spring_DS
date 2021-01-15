package basicinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Zoos {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer num= new StringTokenizer(br.readLine());
	String s= num.nextToken();
	if(s.chars().filter(ch->ch=='o').count() ==s.chars().filter(ch ->ch=='z').count())
	{
		System.out.println("No");
	}
	else
	{
		if(s.chars().filter(ch->ch=='o').count()% s.chars().filter(ch ->ch=='z').count() ==0)
		{
			System.out.println("Yes");		
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
}
}
