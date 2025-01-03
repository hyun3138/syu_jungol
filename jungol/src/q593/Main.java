package q593;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.print("ASCII code =? ");
            int num = sc.nextInt();
            char ch = (char)num;
            if(num>=33 && num<=127) {
                System.out.println(ch);
            } else {
            	sc.close();
            	break;
            }
            }

        }
}
