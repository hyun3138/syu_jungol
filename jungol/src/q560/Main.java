package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int a = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < a) {
				a = arr[i];
			}
		}
		System.out.println(a);
		// Arrays.sort(arr);
		// System.out.print(arr[0]);
	}
}
