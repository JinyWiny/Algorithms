package study.algorithms.datastructure;

import java.util.Random;
import java.util.Scanner;

/**
 * 배열에서 최댓값을 찾는 프로그램.
 * 무작위(Random)로 생성된 여러 개의 키(height) 값 중 최댓값을 계산하여 출력.
 */
 class E4_MaxOfArrayRand {

    static int maxOf(int[] a) {

        int max = a[0];

        for (int i = 1; i < a.length; i++)

            if (a[i] > max)
                max = a[i];

        return max;
    }

    public static void main(String[] args) {

        Random rand = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");

        System.out.print("인원: ");
        int num = scanner.nextInt();

        int[] height = new int[num];

        System.out.println("킷값은 아래와 같습니다.");

        for (int i = 0; i < num; i++) {

            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
