package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split("");
		sc.close();
		String temp;
		for(int i=0; i<str.length; i++) {
			temp = str[str.length-1];
			for(int j=str.length-1; j>0; j--) {
				str[j] = str[j-1];
			}
			str[0] = temp;
			
			for(int k=0; k<str.length; k++) {
				System.out.print(str[k]);
			}
			System.out.println();
		}
	}
}
