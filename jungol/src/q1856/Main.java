package q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 높이
		int y = sc.nextInt(); // 너비
		int value = 1;
		int[][] arr = new int[x][y];
		for(int i=0; i<x; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<y; j++) {
					arr[i][j] = value++;
				}
			} else {
				for(int j=y-1; j>=0; j--) {
					arr[i][j] = value++;
				}
			}
		}
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
