package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * while 문이 종료될 때 변수 값 i값이 n+1이 되는지 확인하세요.
 */
class Q6_While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 힙을 구합니다.");

        System.out.print("n값: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("i의 값 " + i + "은(는) " + n + " + 1 와(과) 같습니다.");
    }
}
