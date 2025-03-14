package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * n단 피라미드를 출력하는 메서드를 작성하세요.
 *
 * static void spira(int n)
 *
 * i 행에는 (ㅑ -1) * 2 + 1개의 *가 출력돠게 하세요.
 * 마지막 n 행에는 (n - 1) * 2 + 1개의 *를 출력하게 됩니다.
 */
class Q15_StarPyramid {

    static void spira(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(' ');
            }

            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {

                System.out.print('*');
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

        spira(n);
    }
}
