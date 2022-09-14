import java.util.Scanner;

public class java001oper {
    public static void main(String[] args) {
        // 연산자 : 프로그램의 산술식 및 연산식 표현 및 처리를 위해 재공되는 기호
        // 산술연산자 (+, -, *, /, %)
        // 대입연산자 (=)
        // 산술+대입 (+=,-=,*=,/=,%=)
        int result = 0;
        int n = 6;
        result += n;
        System.out.println("result += " + result);
        result *= n;
        System.out.println("result *= " + result);
        result -= n;
        System.out.println("result -= " + result);
        result /= n;
        System.out.println("result /= " + result);
        result %= n;
        System.out.println("result %= " + result);

        // 비교연산자 (>,<, <=,>=, ==, !=)
        // 논리연산자 (&, &&, |, ||)

        Scanner s = new Scanner(System.in);

        int money = s.nextInt();

        if (money < 900) {
            System.out.println("돈이 부족합니다. ㅠㅠ");
            System.exit(0);
        }
        if (money >= 900) {
            System.out.println("1.레쓰비(900)");
        }
        if (money >= 1200) {
            System.out.println("2.토레타(1200)");
        }
        if (money >= 1500) {
            System.out.println("3.코카콜라(1500)");
        }
        if (money >= 1800) {
            System.out.println("4.카페라떼(1800)");
        }
        if (money >= 2500) {
            System.out.println("5.스타벅스 카페라떼(2500)");
        }
        if (money >= 4500) {
            System.out.println("6.대용량아메리카노(4500)");
        }
    }
}
