package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 1~10의 합은 (1 + 10) * 5와 같이 구할 수 있습니다.
 * 이를 "가우스의 덧셈"이라고 하는데 이 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
 */
class Q7_GaussSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n값: ");
        int n = scanner.nextInt();

        int sum = n * (n + 1) / 2;

        /**
         * 제시된 풀이
         *
         * int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
        */

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
