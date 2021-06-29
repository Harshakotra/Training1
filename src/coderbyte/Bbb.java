package coderbyte;

import java.util.*;

class Bbb {
//() how many barcets can be formed ()() -->()(),(())
	// for 2 types we can form 2 diff combinations
	public static long BracketCombinations(int num) {
		// code goes here
		long valt = fact(num * 2) / (fact(num) * fact(num + 1));
		return valt;
	}

	public static long fact(int x) {
		long t = 1;
		for (int i = 1; i <= x; i++) {
			t = t * i;
		}
		return t;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(BracketCombinations(Integer.parseInt(s.nextLine())));
	}

}