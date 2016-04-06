
/*
 * [B]84
 * [TA's Advise]
 * 1.士豪哥果然不同凡響, NETBEANS!
 * 2.雖然你寫了interface, 不過沒有implement喔, 但概念是有了, extra bouns +1
 * 3.實作的演算法錯誤(題目要求為Gauss, 此演算法為Anonymous Gregorian, 等級從B開始計算.
 * 4.下次可以在javadoc中寫一些註解.
 * */

import java.util.Scanner;
import pkg403530051_2.Easter;

interface Easter1 {
	public String calculateEaster();

	public int getResult();
}

public class EasterTest {
	public static void main(String[] args) {
		System.out.print("隢頛詨�閬��儔瘣餌���正��僑隞�: ");
		Scanner input = new Scanner(System.in);
		int num = getResult(input);
		while (num <= 0) {
			System.out.print("隢頛詨鞎�=��=");
			num = getResult(input);
		}
		System.out.println(calculateEaster(num));

		System.out.println(Easter.calculateEaster(2001));
		System.out.println(Easter.calculateEaster(2012));

	}

	public static int getResult(Scanner input) {
		while (!input.hasNextInt()) {
			System.out.print("隢���迤蝣箇�僑隞質撓�");
			input.nextLine();
		}
		return input.nextInt();
	}

	public static String calculateEaster(int aYear) {
		int a = aYear % 19, b = aYear / 100, c = aYear % 100, d = b / 4, e = b % 4, g = (8 * b + 13) / 25,
				h = (19 * a + b - d - g + 15) % 30, j = c / 4, k = c % 4, m = (a + 11 * h) / 319,
				r = (2 * e + 2 * j - k - h + m + 32) % 7, n = (h - m + r + 90) / 25, p = (h - m + r + n + 19) % 32;

		String result;
		switch (n) {
		case 1:
			result = "January ";
			break;
		case 2:
			result = "February ";
			break;
		case 3:
			result = "March ";
			break;
		case 4:
			result = "April ";
			break;
		case 5:
			result = "May ";
			break;
		case 6:
			result = "June ";
			break;
		case 7:
			result = "July ";
			break;
		case 8:
			result = "August ";
			break;
		case 9:
			result = "September ";
			break;
		case 10:
			result = "October ";
			break;
		case 11:
			result = "November ";
			break;
		case 12:
			result = "December ";
			break;
		default:
			result = "error";
		}

		return result + p;
	}

}