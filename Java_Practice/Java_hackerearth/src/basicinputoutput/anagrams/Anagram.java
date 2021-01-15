package basicinputoutput.anagrams;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		int Char_numbers = 256;

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		sc.nextLine();

		while(t-- > 0){

		String a = sc.nextLine();

		String b = sc.nextLine();

		int[] aArray = new int[Char_numbers];

		int[] bArray = new int[Char_numbers];


		 

		for(int i = 0; i< a.length(); i++){

		aArray[a.charAt(i)]++;

		}

		for(int i = 0; i< b.length(); i++){

		bArray[b.charAt(i)]++;

		}


		 

		int sum = 0;

		for(int i = 0; i< Char_numbers; i++){

		// System.out.println(i+": " +aArray[i]);

		sum = sum + Math.abs((aArray[i] - bArray[i]));

		}

		System.out.println(sum);

		}
	}

}
