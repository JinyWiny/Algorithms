package study.algorithms.algorithm;

import java.util.Scanner;


/**
 * 입력된 정수 n만큼 '+'와 '-'를 번갈아 가며 출력하는 프로그램
 */
public class E13_Alternative2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n / 2; i++)
            System.out.print("+-");

        if (n % 2 != 0)
            System.out.print("+");
    }
}
