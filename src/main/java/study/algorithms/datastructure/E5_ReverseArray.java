package study.algorithms.datastructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열의 요소를 역순으로 정렬하는 프로그램.
 * 입력받은 배열을 절반씩 교환하는 방식.
 */
class E5_ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {

        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }

    static void reverse(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {

            swap(a, i, a.length - i - 1);
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
