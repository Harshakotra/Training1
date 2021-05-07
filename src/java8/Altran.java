package java8;

import java.util.HashMap;
import java.util.Map;

public class Altran {

	private static void getIndices(int[] nm, int sm) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> maps = new HashMap<>();
		int i, j = 0;
		for (i = 0; i < nm.length; i++)
			for (j = i + 1; j < nm.length; j++) {
				if (nm[i] + nm[j] == sm) {
					maps.put(i, j);
				}
			}
		maps.forEach((x,y)->System.out.println("("+x+","+y+")"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nm= {1,4,5,6,7,8,9};
		int sm=10;
		getIndices(nm,sm);
	}

}
