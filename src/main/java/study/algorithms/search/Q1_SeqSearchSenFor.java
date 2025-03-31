package study.algorithms.search;

import java.util.Scanner;

/**
 * while 문 대신 for 문을 사용하여 수정한 프로그램을 작성하세요.
 */
class Q1_SeqSearchSenFor {

    static int seqSearch(int[] a, int n, int key) {

       int i = 0;

       a[n] = key;

        for (i = 0; a[i] != key; i++) {
            ;
        }

       return i == n ? -1 : i;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {

            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색 값: ");
        int ky = scanner.nextInt();

        int idx = seqSearch(x, num, ky);

        if (idx == -1) {

            System.out.println("그 값의 요소가 없습니다.");
        } else {

            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
