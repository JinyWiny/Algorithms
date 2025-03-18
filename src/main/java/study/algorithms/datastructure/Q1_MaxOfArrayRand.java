package study.algorithms.datastructure;

import java.util.Random;
import java.util.Scanner;

/**
 * 배열에서 최댓값을 찾는 프로그램.
 * 무작위(Random)로 생성된 인원 수만큼 키(height) 값을 생성하고, 그중 최댓값을 계산하여 출력.
 *
 * 키뿐만 아니라 사람 수도 난수로 생성하도록 실습 E4를 수정하여 작성하세요.
 */
 class Q1_MaxOfArrayRand {

    static int maxOf(int[] a) {

        int max = a[0];

        for (int i = 1; i < a.length; i++)

            if (a[i] > max)
                max = a[i];

        return max;
    }

    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");


        int num = 1 + rand.nextInt(20);
        int[] height = new int[num];

        System.out.println("인원은 총 " + num + "입니다.");

        System.out.println("킷값은 아래와 같습니다.");

        for (int i = 0; i < num; i++) {

            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
