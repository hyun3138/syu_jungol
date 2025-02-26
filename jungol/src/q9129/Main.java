package q9129;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] arr = new double[3];  // 입력된 실수를 저장할 배열
        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextDouble();  // 실수 입력 받기
        }
        
        sc.close();
        
        // 출력하기 위한 변수
        int integerPart, decimalPart;

        for (int i = 0; i < 3; i++) {
            // 정수 부분 추출
            integerPart = (int) arr[i];  
            // 소수 부분을 100배한 후 반올림하고 정수로 변환
            decimalPart = (int) Math.round((arr[i] - integerPart) * 100); 

            // 정수 부분과 소수 부분 출력
            System.out.println(integerPart);
            System.out.print(decimalPart);
        }
    }
}
