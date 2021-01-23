package timespacecomplexity;

import java.math.BigInteger;
import java.util.Scanner;

public class APlusB {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	while (sc.hasNext()) {
		BigInteger A,B;
		A= new BigInteger(sc.next());
		 B=new BigInteger(sc.next());
		 System.out.println(A.add(B));
		
	}
}}
