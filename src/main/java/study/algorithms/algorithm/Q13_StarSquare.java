package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.
 */
class Q13_StarSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("변의 길이: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.print('*');

            }

                System.out.println();
        }
    }
}
