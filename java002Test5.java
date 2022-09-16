import java.util.Scanner;

public class java002Test5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int start = 1;
        int end = s.nextInt() + 1;

        // for (int i = 0; i < end; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("*");
        // }

        while (start != end) {
            int temp = 1;
            while (temp != start) {
                System.out.print("*");
                temp++;
            }
            System.out.println("*");
            start++;
        }
    }

}
