package q564;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		
		for(int i=0; i<100; i++) {
			char ch = sc.next().charAt(0);
			if(ch<'A' || ch>'Z') {
				break;
			}
			arr[ch-'A']++;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				System.out.print((char)(i+65) + " : ");
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}
