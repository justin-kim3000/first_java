
// 입력문 작성시 Scanner라는 것을 추가해야함
import java.util.Scanner;

public class java001 {

    // 자바에서의 메인
    // 자바도 마찬가지로 main을 먼저 찾아서 실행
    public static void main(String args[]) {

        // 자바 출력문 : printf(), print(), println()

        // c언어에서 문자열 선언 -> char ch[10];
        // 하지만 자바에서는 String이라는 타입을 통해서 더 간단하게 선언할 수 있음

        String j = "java";

        // 1. System.out.printf() : 자바 출력문 중 하나
        System.out.printf("printf를 사용한 출력\n");
        System.out.printf("%s", "hellow world\n");
        System.out.println("안녕 반가워!");

        // 2. System.out.print() : 자바에서 자주 쓰이는 출력문 중 하나
        System.out.print("use-print\n");
        System.out.print("use-print1\n");

        // 3. System.out.println() : 자바에서 자주 쓰이는 출력문 (한줄 띄움)
        System.out.println("use-print2\n");
        System.out.println("Hellow " + j + " World");

        // * 변수
        // => 정수형, 실수형, 문자형, 논리형
        // - 정수형 :: int, long
        // 정수형에선, int형보다 long 형으로 표현할 수 있는 숫자가 더 많다.
        int age = 24;
        long birth = 1999;

        // 실수형 :: float, double
        // double형이 float형보다 소수점을 더 자세하게 표현할 수 있다.
        double h = 171.5;

        // 문자형 :: char(문자 하나), String(문자 여러개)
        char c = 'A';
        String name = "Justin";

        // 논리형 :: boolean(true, false값 중 하나만 저장)
        boolean gender = false;

        // 입력문
        // Scanner에 대한 변수를 생성하고 사용해야함
        Scanner scan = new Scanner(System.in);

        // 주요 입력문 소개 : 자료형 타입에 따라 사용하는 형태가 다름
        // 변수 선언이 반드시 된 상태에서 입력문을 작성해야함.
        int in = scan.nextInt();
        long lo = scan.nextLong();
        double dou = scan.nextDouble();
        float flo = scan.nextFloat();
        char ch = scan.next().charAt(0);
        String st1 = scan.next(); // 공백없는 문자열(공백 넣으면 잘림)
        String st2 = scan.nextLine(); // 공백 포함한 문자열
        boolean bool = scan.nextBoolean();
    }
}
