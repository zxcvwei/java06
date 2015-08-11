import java.util.Random;

public class Array03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int b[] = new int[10];
		for (int i = 0; i < 10; i++) {
			b[i] = rnd.nextInt(100);
			System.out.print(b[i] + " ");
		}
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (b[i] > b[j]) {
					int v1 = b[i];
					b[i] = b[j];
					b[j] = v1;
				}
			}
		}
		System.out.println("由小到大");
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
