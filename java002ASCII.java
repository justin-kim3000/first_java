import java.util.Scanner;

public class java002ASCII {
    public static void main(String[] args) {
        // 아스키코드 : 우리가 생각하는 문자, 기호를 특정 숫자에 일대일 대응시켜 표현 한 것
        // C언어에서 다루었던 아스키 코드
        System.out.printf("문자로는 %c\n", (char) 'D');
        System.out.printf("문자로는 %d\n", (int) 'D');

        Scanner s = new Scanner(System.in);

        System.out.println("문자를 입력하시오.");

        char word = s.next().charAt(0);

        if (word >= 65 && word <= 90) {
            System.out.printf("%c\n", (char) word + 32);
        } else if (word >= 97 && word <= 122) {
            System.out.printf("%c\n", (char) word - 32);
        } else {
            System.out.println("글자를 파악하지 못하였습니다.");
        }

    }
}
