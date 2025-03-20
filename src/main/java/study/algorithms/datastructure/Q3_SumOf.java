package study.algorithms.datastructure;

import java.util.Scanner;

/**
 * 배열 a의 모든 요소읳 ㅏㅂ계를 구하여 반환하는 메서드를 작성하세요.
 *
 * static int sumOf(int[] a)
 */
class Q3_SumOf {


    static int sumOf(int[] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];
        }

        return  sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.print("a[" + i + "]: ");

            a[i] = scanner.nextInt();
        }

        System.out.println("합계: " + sumOf(a));
    }
}
