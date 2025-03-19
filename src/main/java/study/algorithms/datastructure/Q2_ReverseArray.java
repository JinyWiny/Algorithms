package study.algorithms.datastructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배역 요소를 역순으로 정렬하는 과정을 나타내는 프로그램을 작성하세요.
 */
class Q2_ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {

        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void reverse(int[] a) {

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]을 교환.");
            swap(a, i, a.length - i - 1);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");

        int num = scanner.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.print("x[" + i + "]: ");

            x[i] = scanner.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println("x = " + Arrays.toString(x));
    }
}
