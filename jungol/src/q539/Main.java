package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while(true) {
			int a = sc.nextInt();
			sum += a;
			count++;
			if(a >= 100) {
				break;
			}
		}
		sc.close();
		System.out.println(sum);
		System.out.printf("%.1f", (double)sum / count);
	}
}
