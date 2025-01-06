package q9018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("두 개의 수를 입력하시오. ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}
