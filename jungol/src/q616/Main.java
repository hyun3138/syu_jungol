package q616;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		W w = new W();
		w.x1 = sc.nextInt();
		w.y1 = sc.nextInt();
		w.x2 = sc.nextInt();
		w.y2 = sc.nextInt();
		w.x3 = sc.nextInt();
		w.y3 = sc.nextInt();
		sc.close();
		w.res();
	}
}

class W {
	int x1, y1, x2, y2, x3, y3;

	public void W(int x1, int y1, int x2, int y2, int x3, int y3) {
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
