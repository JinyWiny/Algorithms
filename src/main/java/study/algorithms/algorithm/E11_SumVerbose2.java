package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 입력된 수 n에 대해 1부터 n까지의 합을 구하는 프로그램
 *
 * 사용자로부터 수 n을 입력받아 그 합과 그 값을 구하는 과정 출력
 */
class E11_SumVerbose2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i < n; i++) {

            System.out.print(i + " + ");
            sum += i;
        }

        System.out.print(n + " = ");
        sum += n;

        System.out.println(sum);
    }
}
