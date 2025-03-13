package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 사용자로부터 삼각형의 높이를 입력받아 왼쪽 아래가 직각인 이등변 삼각형을 출력하는 프로그램
 */
class E18_TriangleLB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력");

        do {
            System.out.print("몇 단으로 이루어진 삼각형 입니까?: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
