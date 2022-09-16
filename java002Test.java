import java.util.Scanner;

public class java002Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int result = 1;

        while (m != 0) {
            result = result * m;
            m--;
        }

        System.out.println(result);
    }
}
