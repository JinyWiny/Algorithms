package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 입력된 정수 n에 대해 1부터 n까지의 합을 구하는 프로그램
 *
 * 사용자로부터 정수 n을 입력받아 for 문을 사용하여 1부터 n까지의 합을 계산하고 출력
 */
class E8_SumFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 힙을 구합니다.");

        System.out.print("n값: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum = sum + i;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
