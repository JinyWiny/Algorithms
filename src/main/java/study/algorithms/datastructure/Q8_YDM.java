package study.algorithms.datastructure;

import java.util.Scanner;

/**
 * 년월일을 필드로 갖는 클래스를 만드세요.
 * 다음과 같이 생성자(constructor)와 메서드를 정의해야 합니다.
 *
 * 생성자(주어진 날짜로 설정)
 * YDM(int y, int m, int d)
 *
 * n일 뒤의 날짜를 반환
 * YMD after(int n)
 *
 * n일 앞의 날짜를 반환
 * YDM before(int n)
 */
class Q8_YDM {

    int y;
    int m;
    int d;

    Q8_YDM(int y, int m, int d) {

        this.y = y;
        this.m = m;
        this.d = d;
    }

    static int[][] monthDays = {

            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {

        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    Q8_YDM before(int n) {

        Q8_YDM tmp = new Q8_YDM(this.y, this.m, this.d);

        if (n < 0) {

            return after(-n);
        }

        tmp.d -= n;

        while (tmp.d < 1) {

            if (--tmp.m < 1) {

                tmp.y--;
                tmp.m = 12;
            }

            tmp.d += monthDays[isLeap(tmp.y)][tmp.m - 1];
        }

        return tmp;
    }

    Q8_YDM after(int n) {

        Q8_YDM tmp = new Q8_YDM(this.y, this.m, this.d);

        if (n < 0) {

            return before(-n);
        }

        tmp.d += n;

        while (tmp.d > monthDays[isLeap(tmp.y)][tmp.m- 1 ]) {

            tmp.d -= monthDays[isLeap(tmp.y)][tmp.m- 1 ];

            if (++tmp.m > 12) {

                tmp.y++;
                tmp.m = 1;
            }
        }

        return tmp;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("날짜를 입력하세요.\n");

        System.out.print("년: ");  int y = scanner.nextInt();
        System.out.print("월: ");  int m = scanner.nextInt();
        System.out.print("일: ");  int d = scanner.nextInt();

        Q8_YDM date = new Q8_YDM(y, m, d);

        System.out.print("며칠 전 or 후의 날짜를 구할까요? : ");
        int n = scanner.nextInt();

        Q8_YDM d1 = date.after(n);
        System.out.printf("%d일 후의 날짜는 %d년 %d월 %d일 입니다.\n", n, d1.y, d1.m, d1.d);

        Q8_YDM d2 = date.before(n);
        System.out.printf("%d일 전의 날짜는 %d년 %d월 %d일 입니다.\n", n, d2.y, d2.m, d2.d);
    }
}
