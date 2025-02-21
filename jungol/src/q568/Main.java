package q568;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][4];
		int[][] brr = new int[2][4];
		
		System.out.println("first array");
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("second array");
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		
		int[][] res = new int[2][4];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				res[i][j] = arr[i][j] * brr[i][j];
			}
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
