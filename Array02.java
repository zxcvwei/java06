import java.util.Scanner;
import java.util.Random;

public class Array02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("亂數產生10個數字");
		int b[] = new int[10];
		int i = 0;
		int c = 0;
		int k = 0;
		boolean flag = false;
		while (i < 10) {
			flag = false;
			b[i] = rnd.nextInt((100) + 1);
			for (int j=0; j < i; j++) {
				if (b[i] == b[j]) {
					flag = true;
				} 
			}
			if(flag==false){
				if (b[i] % 2 == 0) {
					c++;
				}
				i++;
			}
		}
		System.out.println("請猜有幾個數字是偶數(0~10)");
		while (k < 3) {
			int n1 = scn.nextInt();
			if (c == n1) {
				k = 3;
				System.out.println("恭喜你答對了!!");
			} else {
				k++;
				if (k == 3) {
					System.out.println("你答錯了");
				} else {
					System.out.println("你答錯了 再試一次");
				}
			}
		}
		for ( i = 0; i < 10; i++) {
			System.out.print(b[i] + " ");
		}

	}
}