package study.algorithms.search;

import java.util.Scanner;

/**
 * 이진 검색 과정을 자세히 출력하는 프로그램을 작성하세요.
 * 각 행의 맨 왼쪽에 현재 선택한 요소의 인덱스를 출력하고,
 * 검색 범위의 첫 요소 위에 <-, 끝 요소 위에 ->, 현재 선택한 중앙 요소 위에 +를 출력하세요.
 */
class Q4_BinSearch {

    static int binSearch(int[] a, int n, int key) {

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

        int pl = 0;
        int pr = n - 1;

        do {
            int   pc = (pl + pr) / 2;
            System.out.print("   |");

            if (pl != pc) {

                System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "",
                        "");
            } else {

                System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
            }

            if (pc != pr) {

                System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
            } else {

                System.out.println("->");
            }

            System.out.printf("%3d|", pc);

            for (int k = 0; k < n; k++) {

                System.out.printf("%4d", a[k]);
            }

            System.out.println("\n   |");
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

        System.out.println("오름차순 입력.");

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
        int idx = binSearch(x, num, ky);

        if (idx == -1) {

            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {

            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
