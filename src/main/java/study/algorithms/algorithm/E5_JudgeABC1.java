package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 입력된 정수에 따라 특정 문자를 출력하는 프로그램
 *
 * 사용자로부터 한 개의 정수를 입력받고, 1이면 "A", 2이면 "B", 그 외에는 "C"를 출력
 */
class E5_JudgeABC1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("정수를 입력하세요.: ");
            int n = scanner.nextInt();

            if (n == 1)
                System.out.println("A");

            else if (n == 2)
                System.out.println("B");

            else
                System.out.println("C");
        }
}
