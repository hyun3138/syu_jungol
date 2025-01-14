package q111;

import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[4];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		int avg = sum / score.length;
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
	}
}
