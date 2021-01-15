package basicinputoutput.splithouses;

import java.util.Scanner;

public class Split_House {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int grids = scan.nextInt();

		String village = scan.next();

		if(village.contains("HH")){

		System.out.println("NO");

		}else 
			if(village.contains(".")){

		village = village.replace('.','B');

		System.out.println("YES");

		grids = 1;

		}else 
			if(village.contains("H")){

		System.out.println("YES");

		grids=1;

		}

		if(grids == 1){

		System.out.println(village);

		}
	}

}
