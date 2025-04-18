package study.algorithms.search;

import java.util.Scanner;

/**
 * 이진 검색(Binary Search) 알고리즘.
 */
class E4_BinSearch {

    static int binarySearch(int[] a, int n, int key) {

        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;

            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하시오.");

        System.out.print("x[0]: ");
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {

            do {
                System.out.print("x[" + i + "]: ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();

        int idx = binarySearch(x, num, ky);

        if (idx == -1) {

            System.out.println("해당 값의 요소가 없습니다.");
        } else {

            System.out.println("해당 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
