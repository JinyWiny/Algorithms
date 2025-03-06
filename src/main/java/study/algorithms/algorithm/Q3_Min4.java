package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 네 값의 최솟값을 구하는 min4 메서드를 작성세요.
 * 작성한 메서드를 테스트하기 위해 main 메서드를 포함한 프로그램을 작성해야 합니다.
 */
class Q3_Min4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최솟값");

        System.out.print("a의 값: ");
        int a = scanner.nextInt();

        System.out.print("b의 값: ");
        int b = scanner.nextInt();

        System.out.print("c의 값: ");
        int c = scanner.nextInt();

        System.out.print("d의 값: ");
        int d = scanner.nextInt();

        int max =a;

        if (b < max) max = b;
        if (c < max) max = c;
        if (d < max) max = d;

        System.out.println("최솟값은 " + max);
    }
}
