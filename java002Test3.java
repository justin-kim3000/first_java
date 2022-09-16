import java.util.Scanner;

public class java002Test3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T != 0) {
            int A = s.nextInt();
            int B = s.nextInt();
            System.out.println(A + B);
            T--;
        }
    }
}
