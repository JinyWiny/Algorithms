package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하세요.
 *
 * static void npira(int n)
 *
 * i행에 출력하는 숫자는 i % 10으로 구하세요.
 */
class Q16_NumberPyramid {

    static void npira(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(' ');
            }

            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {

                System.out.print(i % 10);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("단수: ");
            n = scanner.nextInt();
        } while (n <= 0);

        npira(n);
    }
}
