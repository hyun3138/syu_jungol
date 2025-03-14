package q193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		char c = sc.next().charAt(0);
		String find = sc.next();
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains(find) || arr[i].contains(String.valueOf(c))) {
				System.out.println(arr[i]);
				found = true;
			}
		}
		if(found != true) {
			System.out.println("none");
		}
	}
}
