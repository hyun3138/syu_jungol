package q616;

import java.util.Scanner;

public class Q616 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 생성자를 이용해 값 초기화
        W1 w = new W1(
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
        );
        sc.close();

        w.res();
    }
}

class W1 {
    int x1, y1, x2, y2, x3, y3;

    // ✅ 생성자 (void 제거)
    public W1(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void res() {
        double x = (double) (x1 + x2 + x3) / 3;
        double y = (double) (y1 + y2 + y3) / 3;
        System.out.printf("(%.1f, %.1f)", x, y);
    }
}
