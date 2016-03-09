/*
 * [A]102
 * [TA's advise]
 * 1.能夠加入自己的想法去完成多個圖形的計算是非常好的一件事情, 這邊會給你extra bouns +2(extra會列入成績計算中, 不受限於滿分為100, 你是102就是紀錄102, 學期末一起平均)
 * 2.for-loop內似乎有些東西多餘了, 提供給你作為參考:
 * i已經宣告為index值,其實j想呈現的意思可以被i+1取代, 無須再重新宣告. 
 * 3.看到你的try-catch是一個很棒的事情, 有例外處理的概念, 不過建議要有System.exit(0)丟出去讓程式中止的程序.
 * 4.Rectangle裡頭的properties宣告為public, 有沒有更好的辦法(private, protected..?)
 * 5.你的程式僅適用x,y,w,h為integer的狀況, 但如果他今天是float的話可能就無法作正確的計算囉, 不過這次老師沒有特別要求, 所以這部份是Ok的.
 * */

package rectangle;

import java.util.Scanner;

public class RectangleTester {

	public static void main(String[] args) {
		int x, y, w, h, n;

		try {
			Scanner input = new Scanner(System.in);

			System.out.print("請輸入你要建立的長方形個數: ");
			n = input.nextInt();
			Rectangle[] arrayRect = new Rectangle[n];

			for (int i = 0; i < n; i++) {
				int j = i;
				System.out.printf("請輸入第%d長方形的 x座標 , y座標 , Width , Height(以空白分開): ", ++j);
				x = input.nextInt();
				y = input.nextInt();
				w = input.nextInt();
				h = input.nextInt();

				arrayRect[i] = new Rectangle(x, y, w, h);
			}

			for (int i = 0; i < n; i++) {
				int j = i;
				System.out.printf("第%d個長方形" + arrayRect[i] + "\n", ++j);
			}
			System.out.println("\n" + "End of Output!");
		} catch (Exception e) {
			System.out.println("請您照著格式輸入拜託><!!");
		}
	}
}

class Rectangle {
	public int width = 0, height = 0, x, y;
	public int area, perimeter;

	public Rectangle(int x, int y, int width, int height) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String toString() {
		area = getWidth() * getHeight();
		perimeter = (getWidth() + getHeight()) * 2;
		String msg1 = String.format("Rectangle[x=%d, y=%d, width=%d, height=%d]", x, y, width, height);
		String msg2 = String.format("\nArea=%d \nPerimeter=%d", area, perimeter);
		return msg1 + msg2;
	}
}
