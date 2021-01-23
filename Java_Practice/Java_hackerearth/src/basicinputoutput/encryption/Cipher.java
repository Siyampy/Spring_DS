package basicinputoutput.encryption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cipher {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		int n,key=Integer.parseInt(br.readLine());
		n=0;
		for (char c : s.toCharArray())
		{
			if((c>=65&& c<=90) || (c>=97 && c<=122)||(c>=48 &&c<=57))
			{
				if(((c+key)>90)&&(c>=65&& c<=90))
				{
					n=65+(((c+key)-65)%26);
				}
				else
				{
					if(( (c+key)>122)&&(c>=97 && c<=122))
					{
						n=97+(((c+key)-97)%26);
					}
					else
					{
						if(( (c+key)>57)&&(c>=48 && c<=57))
						{
							n=48+(((c+key)-48)%10);
						}
						else
						{
							n=c+key;
						}
						
					}
				}
				
				System.out.print((char)(n));
			
			}
			else
			{
				System.out.print(c);
				
			}
			
		}
		
	}

}
