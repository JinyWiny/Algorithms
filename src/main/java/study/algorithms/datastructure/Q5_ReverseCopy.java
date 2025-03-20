package study.algorithms.datastructure;

import java.util.Scanner;

/**
 * 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요.
 *
 * static void rcopy(int[] a, int[] b)
 */
class Q5_ReverseCopy {

    static void rcopy(int[] a, int[] b) {

        int num = a.length <= b.length ? a.length : b.length;

        for (int i = 0; i < num; i++) {

            a[i] = b[b.length - i - 1];
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a 요솟수: ");
        int num1 = scanner.nextInt();

        int[] a = new int[num1];

        for (int i = 0; i < num1; i++) {

            System.out.print("a[" + (i + 1) + "]: ");

            a[i] = scanner.nextInt();
        }

        System.out.print("b 요솟수: ");
        int num2 = scanner.nextInt();

        int[] b = new int[num2];

        for (int i = 0; i < num2; i++) {

            System.out.print("b[" + (i + 1) + "]: ");

            b[i] = scanner.nextInt();
        }

        rcopy(a, b);

        for (int i = 0; i < num1; i++) {

            System.out.println("a[" + i + "]: " + a[i]);
        }
    }
}
