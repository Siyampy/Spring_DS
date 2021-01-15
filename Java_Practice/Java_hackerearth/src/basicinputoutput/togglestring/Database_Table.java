package basicinputoutput.togglestring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Database_Table {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer num= new StringTokenizer(br.readLine());
		int N=Integer.parseInt(num.nextToken());
		for (int i = 0; i < N; i++) 
		{
			StringTokenizer num_att= new StringTokenizer(br.readLine()," ");
			int att=Integer.parseInt(num_att.nextToken());
			int val=Integer.parseInt(num_att.nextToken());
			StringTokenizer att_name= new StringTokenizer(br.readLine()," ");
			System.out.println("+-------------+------------+--------+------------+--------+");
			for (int j = 0; j < att; j++) {
				System.out.print("| "+att_name.nextToken()+"        ");			
			}
			
			for (int j = 0; j < val; j++)
			{
				StringTokenizer att_value= new StringTokenizer(br.readLine()," ");
				System.out.print("| "+att_value.nextToken()+"ea");	
				
			}
			
			
		}

	}

}
