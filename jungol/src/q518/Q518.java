package q518;

import java.util.Scanner;

public class Q518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum/arr.length));
	}
}
