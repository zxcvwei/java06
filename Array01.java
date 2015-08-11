import java.util.Scanner;
import java.util.Random;

public class Array01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("亂數產生10個數字");
		int b[] = new int[10];
		int c = 0;
		int j = 0;
		for (int i = 0; i < 10; i++) {
			b[i] = rnd.nextInt((100) + 1);
			if (b[i] % 2 == 0) {
				c++;
			}
		}
		System.out.println("請猜有幾個數字是偶數(0~10)");
		while (j < 3) {
			int n1 = scn.nextInt();
			if (c == n1) {
				j = 3;
				System.out.println("恭喜你答對了!!");
			} else {
				j++;
				if (j == 3) {
					System.out.println("你答錯了");
				} else {
					System.out.println("你答錯了 再試一次");
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
