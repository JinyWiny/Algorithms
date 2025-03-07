package study.algorithms.algorithm;

import java.util.Scanner;

/**
 * 정숫값의 부호(양수/음수/0)을 판단하는 프로그램
 *
 * 사용자로부터 한 개의 정수를 입력받고, 해당 정수의 부호를 판단아여 출력
 */
class E4_JudgeSign {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("정수를 입력하세요.: ");
            int n = scanner.nextInt();

            if (n > 0)
                System.out.println("이 수는 양수입니다.");

            else if (n < 0)
                System.out.println("이 수는 음수입니다.");

            else
                System.out.println("이 수는 0입니다.");
        }
}
