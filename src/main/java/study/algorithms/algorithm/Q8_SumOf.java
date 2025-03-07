package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하세요.
 *
 * static int sumof(int a, int b)
 *
 * a와 b의 대소 관계에 상관없이 합을 구하세요. 예를 들어 a가 3, b가 5이면 12를, a가 6, b가 4이면 15를 반환합니다.
 */
class Q8_SumOf {

    static int sumof(int a, int b) {

        int max;
        int min;

        if (a < b) {
            max = b;
            min = a;
        } else {
            max = a;
            min = b;
        }

        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a의 값: ");
        int a = scanner.nextInt();

        System.out.print("b의 값: ");
        int b = scanner.nextInt();

        System.out.println("정수 a, b 사이의 모든 정수의 총합 = " + sumof(a, b));
    }
}
