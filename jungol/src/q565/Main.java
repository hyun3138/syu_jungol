package q565;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];  // 10의 자리를 카운트할 배열
        int num;

        while (true) {
            num = scanner.nextInt();  // 숫자 입력 받기
            if (num == 0) {  // 0이 입력되면 종료
                break;
            }
            arr[num / 10]++;  // 10의 자리 카운트
        }

        // 배열 출력
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {  // 카운트된 값이 있으면 출력
                System.out.println(i + " : " + arr[i]);
            }
        }

        scanner.close();  // Scanner 자원 닫기
    }
}