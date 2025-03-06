package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 세 개의 정수 중 최댓값을 구하는 프로그램
 *
 * 사용자로부터 세 개의 정수를 입력받고, 가장 큰 값을 찾아 출력
 */
class E1_Max3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최댓값");

        System.out.print("a의 값: ");
        int a = scanner.nextInt();

        System.out.print("b의 값: ");
        int b = scanner.nextInt();

        System.out.print("c의 값: ");
        int c = scanner.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max);
    }
}
