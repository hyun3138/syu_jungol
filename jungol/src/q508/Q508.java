package q508;

public class Q508 {
	public static void main(String[] args) {
		String[][] arr = { {"item", "count", "price"}, {"pen", "20", "100"}, {"note", "5", "95"},{"eraser", "110", "97"}};
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("%10s", arr[i][j]);
			}
			System.out.println();
		}
	}
}
