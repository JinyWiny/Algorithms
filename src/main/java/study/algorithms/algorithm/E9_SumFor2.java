package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 입력된 양수 n에 대해 1부터 n까지의 합을 구하는 프로그램
 *
 * 사용자로부터 정수 n을 입력받아 do-while 문을 사용하여 양수값 입력을 유도한 후,
 * for 문을 이용하여 1부터 n까지의 합을 계산하고 출력
 */
class E9_SumFor2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
