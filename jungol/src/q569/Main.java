package q569;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int count = 0;
		for(int i=0; i<5; i++) {
			int sum =0;
			int res = 0;
			for(int j=0; j<4; j++) {
				arr[j] = sc.nextInt();
			}
			for(int k=0; k<arr.length; k++) {
				sum += arr[k];
				res = sum / arr.length;
			}
			if(res >= 80) {
				System.out.println("pass");
				count++;
			} else {
				System.out.println("fail");
			}
		}
		sc.close();
		System.out.println("Successful : " + count);
	}
}
