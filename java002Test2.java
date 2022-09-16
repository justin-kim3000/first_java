import java.util.Scanner;

public class java002Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = 1;
        while (K <= 9) {
            System.out.println(N + " * " + K + " = " + N * K);
            K++;
        }
    }
}
