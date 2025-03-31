package study.algorithms.search;

import java.util.Scanner;

/**
 * 선형 검색의 스컈닝 과정을 자세히 출력하느느 프로그램을 작성하세요.
 *
 * 이따 각 행의 맨 왼쪽에 현재 선택한 요소의 인덱스를 출력하고,
 * 현재 선택한 요소 위에 기호 +를 출력하세요.
 */
class Q2_SeqSearch {

    static int seqSearch(int[] a, int n, int key) {

        System.out.print("   |");

        for (int k = 0; k < n; k++) {

            System.out.printf("%4d", k);
        }

        System.out.println();
        System.out.print("---+");

        for (int k = 0; k < 4 * n + 2; k++) {

            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);

            for (int k = 0; k < n; k++) {

                System.out.printf("%4d", a[k]);
            }

            System.out.println("\n   |");

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
