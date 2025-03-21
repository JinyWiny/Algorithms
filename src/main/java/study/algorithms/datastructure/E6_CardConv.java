package study.algorithms.datastructure;

import java.util.Scanner;

/**
 * 사용자가 입력한 10진수를 원하는 기수(2~36)로 변환하여 출력.
 */
class E6_CardConv {

    static int cardConv(int x, int r, char[] d) {

        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {

            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

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
