package fastio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/

//User defined method for very fast IO compared to the BufferedReader
public class FastReader 
{
	 BufferedReader br; 
     StringTokenizer st; 

     public FastReader() 
     { 
         br = new BufferedReader(new
                  InputStreamReader(System.in)); 
     } 

     String next() 
     { 
         while (st == null || !st.hasMoreElements()) 
         { 
             try
             { 
                 st = new StringTokenizer(br.readLine()); 
             } 
             catch (IOException  e) 
             { 
                 e.printStackTrace(); 
             } 
         } 
         return st.nextToken(); 
     } 

     public int nextInt() 
     { 
         return Integer.parseInt(next()); 
     } 

     long nextLong() 
     { 
         return Long.parseLong(next()); 
     } 

     double nextDouble() 
     { 
         return Double.parseDouble(next()); 
     } 

     String nextLine() 
     { 
         String str = ""; 
         try
         { 
             str = br.readLine(); 
         } 
         catch (IOException e) 
         { 
             e.printStackTrace(); 
         } 
         return str; 
     } 

}
