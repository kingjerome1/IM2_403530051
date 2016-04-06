/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg403530051_2;

public class Easter {

	int aYear;
	static int aMonth, aDay;

	Easter() {

	}

	public static void gauss_algorithm(int aYear) {
		// Math.floor(), -2
		int a = aYear % 19, b = aYear / 100, c = aYear % 100, d = b / 4, e = b % 4, f = (b + 8) / 25,
				g = (b - f + 1) / 3, h = (19 * a + b - d - g + 15) % 30, i = c / 4, k = c % 4,
				l = (32 + 2 * e + 2 * i - h - k) % 7, m = (a + 11 * h + 22 * l) / 451;
		aMonth = ((h + l - 7 * m + 114) / 31);
		aDay = ((h + l - 7 * m + 114) % 31) + 1;

	}

	public static String calculateEaster(int aYear) {

		gauss_algorithm(aYear);
		return "In " + String.format("%d", aYear) + ", Easter Sunday is: month = " + String.format("%d", aMonth)
				+ " and day = " + String.format("%d", aDay);

	}
}
