package study.algorithms.datastructure;

import java.util.Scanner;

/**
 * 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요.
 *
 * 사용자가 입력한 10진수를 원하는 기수(2~36)로 변환하여 출력.
 */
class Q6_CardConv {

    static int cardConv(int x, int r, char[] d) {

        int n = ((Integer)x).toString().length();
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);

        do {
            System.out.printf("   +");

            for (int i = 0; i < n + 2; i++) {
                System.out.print('-');
            }

            System.out.println();

            if (x / r != 0) {
                System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n),
                        r, x / r, x % r);
            } else {
                System.out.printf(String.format("     %%%dd    ... %%d\n", n),
                        x / r, x % r);
            }

            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        return digits;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.print("변환하는 음수 아닌 정수: ");
                no = scanner.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 정수로 변환할 것인가요? (2-36): ");
                cd = scanner.nextInt();
            } while (cd < 2 || cd >36);

            dno = cardConv(no, cd, cno);

            System.out.println(cd + "진수로");

            for (int i = 0; i < dno; i++) {

                System.out.print(cno[i]);
            }

            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1_예 / 0_아니오): ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}
