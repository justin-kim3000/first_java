import java.util.Scanner;

public class java003switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // switch : 반복문 +조건문 합친 형태
        // 학점 계산
        int score = s.nextInt();
        switch (score / 10) { // score의 값에 따라 경우가 달라짐
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
