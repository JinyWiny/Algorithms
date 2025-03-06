package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 세 개의 정수 중 중앙값 구하는 프로그램
 *
 * 사용자로부터 세 개의 정수를 입력받고, 중앙에 위치하는 값을 찾아 출력
 */
class E3_Median {

    static int med3(int a, int b, int c) {

        if (a >= b)

            if (b >= c)
                return b;

            else if (a <= c)
                return a;

            else
                return c;

        else if (a > c)
            return a;

        else if (b > c)
            return c;

        else
            return b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중앙값");

        System.out.print("a의 값: ");
        int a = scanner.nextInt();

        System.out.print("b의 값: ");
        int b = scanner.nextInt();

        System.out.print("c의 값: ");
        int c = scanner.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c));
    }
}
