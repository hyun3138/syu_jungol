package q518;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}
