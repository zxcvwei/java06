import java.util.Scanner;
import java.util.Random;

public class Array01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("�üƲ���10�ӼƦr");
		int b[] = new int[10];
		int c = 0;
		int j = 0;
		for (int i = 0; i < 10; i++) {
			b[i] = rnd.nextInt((100) + 1);
			if (b[i] % 2 == 0) {
				c++;
			}
		}
		System.out.println("�вq���X�ӼƦr�O����(0~10)");
		while (j < 3) {
			int n1 = scn.nextInt();
			if (c == n1) {
				j = 3;
				System.out.println("���ߧA����F!!");
			} else {
				j++;
				if (j == 3) {
					System.out.println("�A�����F");
				} else {
					System.out.println("�A�����F �A�դ@��");
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
