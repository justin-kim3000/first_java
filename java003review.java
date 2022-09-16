import java.util.*;

import javax.print.event.PrintJobListener;

public class java003review {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 리뷰: if문, 아스키코드, for, while

        // 아스키코드
        // char ch = s.next().charAt(0);

        // if (ch >= 97 && ch <= 122) { // 소문자인 경우('a':97)
        // System.out.println("아스키코드 값은 " + (int) ch);
        // System.out.println("소문자 -> 대문자 " + (char) (ch - 32));

        // } else if (ch >= 65 && ch <= 90) {
        // System.out.println("아스키코드 값은 " + (int) ch);
        // System.out.println("소문자 -> 대문자 " + (char) (ch + 32));
        // } else {
        // System.out.println("입력받은 문자는 영문자가 아닙니다.");
        // }
        // 2. 반복문
        // 언젠가는 조건문을 불만족 시켜야한다.
        // System.out.println("문자를 입력하시오.");
        // char c = s.next().charAt(0);
        // System.out.println("반복횟수를 입력하시오.");
        // int count = s.nextInt();
        // int nom = 1;
        // while (nom <= count) {
        // System.out.print(c);
        // nom++;
        // }

        // 3. for문
        // int inputNumber = s.nextInt();
        // for (int i = 1; i <= 19; i++) {
        // System.out.println(inputNumber + " * " + i + " = " + inputNumber * i);
        // }

        // // 무한 반복문 사용

        // while (true) { // 일단은 무조건 실행
        // int n1 = s.nextInt();
        // int n2 = s.nextInt();
        // if (n1 == 0 && n2 == 0) {
        // break;
        // } else {
        // System.out.println(n1 + n2);
        // }
        // }

        while (true) {
            char ch1 = s.next().charAt(0);

            if (ch1 == '0') {
                break;
            } else {
                if (ch1 >= 97 && ch1 <= 122) {
                    System.out.println("아스키코드 값은 " + (int) ch1);
                } else if (ch1 >= 65 && ch1 <= 90) {
                    System.out.println("아스키코드 값은 " + (int) ch1);
                } else {
                    System.out.println("입력받은 문자는 영문자가 아닙니다.");
                }
            }
        }
    }
}
