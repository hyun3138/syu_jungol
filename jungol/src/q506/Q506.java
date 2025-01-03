package q506;

public class Q506 {
    public static void main(String[] args) {
        Object[] arr = new Object[4];
        arr[0] = "My height";
        arr[1] = 170;
        arr[2] = "My weight";
        arr[3] = String.format("%.6f", (double)68.6);
        
        for(int i=0; i<4; i++) {
            System.out.println(arr[i]);
        }
    }
}
