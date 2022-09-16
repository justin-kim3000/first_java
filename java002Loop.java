import java.util.Scanner;

public class java002Loop {
    public static void main(String[] args) {
        // 반복문 : for문, while문, do-while문
        // 조건문+반복문 : switch문
        Scanner s = new Scanner(System.in);

        // 1. while문
        // int num = 1;
        // while (num <= 10) {
        // System.out.println(num + " ");
        // num += 1;
        // }

        // 문제 : n과 m을 입력받아서 n부터 m까지 출력하는 구문 작성
        // int n, m;
        // System.out.print("2가지 숫자를 입력하시오. : ");
        // n = s.nextInt();
        // m = s.nextInt();

        // if (n <= m) {
        // while (n <= m) {
        // System.out.printf("%d ", n);
        // n += 1;
        // }
        // } else {
        // System.out.println("n은 m보다 작아야 합니다.");

        // }

        // 2. for문 while문 예제
        System.out.print("학생 수 입력 : ");
        int Num = s.nextInt();
        int sumScore = 0;
        for (int i = 1; i <= Num; i++) {
            System.out.print("학생 " + i + "번의 성적:");
            int score = s.nextInt();
            sumScore += score;
        }
        System.out.println("성적의 합은 : " + sumScore + "입니다");
        double avr = (double) sumScore / Num;
        System.out.println("성적의 평균은 " + avr);
    }
}
