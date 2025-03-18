package study.algorithms.datastructure;

import java.util.Scanner;

/**
 * 배열에서 최댓값을 찾는 프로그램.
 * 사용자로부터 입력받은 여러 개의 키(height) 값 중 최댓값을 계산하여 출력.
 */
 class E3_MaxOfArray {

    static int maxOf(int[] a) {

        int max = a[0];

        for (int i = 1; i < a.length; i++)

            if (a[i] > max)
                max = a[i];

        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");

        System.out.print("인원: ");
        int num = scanner.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.print("height[" + i + "]: ");
            height[i] = scanner.nextInt();
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
