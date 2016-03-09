/*
 * [A]102
 * [TA's advise]
 * 1.����[�J�ۤv���Q�k�h�����h�ӹϧΪ��p��O�D�`�n���@��Ʊ�, �o��|���Aextra bouns +2(extra�|�C�J���Z�p�⤤, �������󺡤���100, �A�O102�N�O����102, �Ǵ����@�_����)
 * 2.for-loop�����G���ǪF��h�l�F, ���ѵ��A�@���Ѧ�:
 * i�w�g�ŧi��index��,���j�Q�e�{���N��i�H�Qi+1���N, �L���A���s�ŧi. 
 * 3.�ݨ�A��try-catch�O�@�ӫܴΪ��Ʊ�, ���ҥ~�B�z������, ���L��ĳ�n��System.exit(0)��X�h���{������{��.
 * 4.Rectangle���Y��properties�ŧi��public, ���S����n����k(private, protected..?)
 * 5.�A���{���ȾA��x,y,w,h��integer�����p, ���p�G�L���ѬOfloat���ܥi��N�L�k�@���T���p���o, ���L�o���Ѯv�S���S�O�n�D, �ҥH�o�����OOk��.
 * */

package rectangle;

import java.util.Scanner;

public class RectangleTester {

	public static void main(String[] args) {
		int x, y, w, h, n;

		try {
			Scanner input = new Scanner(System.in);

			System.out.print("�п�J�A�n�إߪ�����έӼ�: ");
			n = input.nextInt();
			Rectangle[] arrayRect = new Rectangle[n];

			for (int i = 0; i < n; i++) {
				int j = i;
				System.out.printf("�п�J��%d����Ϊ� x�y�� , y�y�� , Width , Height(�H�ťդ��}): ", ++j);
				x = input.nextInt();
				y = input.nextInt();
				w = input.nextInt();
				h = input.nextInt();

				arrayRect[i] = new Rectangle(x, y, w, h);
			}

			for (int i = 0; i < n; i++) {
				int j = i;
				System.out.printf("��%d�Ӫ����" + arrayRect[i] + "\n", ++j);
			}
			System.out.println("\n" + "End of Output!");
		} catch (Exception e) {
			System.out.println("�бz�ӵۮ榡��J���U><!!");
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
