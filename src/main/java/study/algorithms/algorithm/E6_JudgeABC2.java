package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 입력된 정수에 따라 특정 문자를 출력하는 프로그램
 *
 * 사용자로부터 한 개의 정수를 입력받고, 1이면 "A", 2이면 "B", 3이면 "C", 그 외에는 미출력
 */
class E6_JudgeABC2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("정수를 입력하세요.: ");
            int n = scanner.nextInt();

            if (n == 1)
                System.out.println("A");

            else if (n == 2)
                System.out.println("B");

            else if (n == 3)
                System.out.println("C");

            else
                ;
        }
}
