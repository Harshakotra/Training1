package coderbyte;

import java.util.*;

class FindIntersection {

	public static String findIntersection(String[] string) {
		// code goes here
		String[] strn = string[0].split(", ");
		String[] strn1 = string[1].split(", ");
		Set<Integer> fin = new TreeSet<>();

		for (int i = 0; i < strn.length; i++) {
			for (int j = 0; j < strn1.length; j++)
				if (strn[i].equals(strn1[j])) {
					fin.add(Integer.parseInt(strn[i]));
				}

		}
		if (fin.isEmpty()) {
			return "false";
		}

		String stt = fin.toString().replaceAll("\\s", "");
		return stt.substring(1, stt.length() - 1);
	}

	public static void main(String[] args) {
		// keep this function call here
		// Scanner s = new Scanner(System.in);
		String[] sn = { "1, 2, 3, 4, 5", "8, 11, 23" };
		System.out.print(findIntersection(sn));
	}

}