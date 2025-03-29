package study.algorithms.search;

import java.util.Scanner;

/**
 * 순차 검색(Sequential Search) 알고리즘.
 *
 * for문 이용.
 */
class E2_SeqSearchFor {

    static int seqSearch(int[] a, int n, int key) {

        for (int i = 0; i < n; i++) {

            if (a[i] == key) {
                return i;
            }
        }

        return -1;
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
