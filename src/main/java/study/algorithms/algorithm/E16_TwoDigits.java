package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 2자리의 양수를 입력 받는 프로그램
 */
class E16_TwoDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int no;

        System.out.println("2자리의 양수를 입력하세요.");

        do {
            System.out.print("no값: ");
            no  = scanner.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("변수 no의 값은 " + no + "이 되었습니다.");
    }
}
