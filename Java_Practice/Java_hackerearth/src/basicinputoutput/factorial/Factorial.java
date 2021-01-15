package basicinputoutput.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int factorial = sc.nextInt();

		int total = factorial;

		int i;

		for(i=factorial-1;i>1;i--){

		total=total*i;

		}

		System.out.println(total);

	}

}
