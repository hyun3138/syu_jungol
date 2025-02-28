package q190;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"flower", "rose", "lily", "daffodil", "azalea"};
		int count = 0;
		char ch = sc.next().charAt(0);
		for(int i=0; i<arr.length; i++) {
			if(arr[i].charAt(1) == ch || arr[i].charAt(2) == ch) {
				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println(count);
	}
}
