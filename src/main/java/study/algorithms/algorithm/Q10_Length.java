package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
 *
 * 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고,
 * 1314를 입력하면 '그 수는 4자리입니다.'라고 출력합니다.
 */
class Q10_Length {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n;

        do {
            System.out.print("정숫값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int no = 0;

        while (n > 0) {
            n /= 10;
            no++;
        }

        System.out.println("입력하신 값은 " + no + "자리입니다.");
    }
}
