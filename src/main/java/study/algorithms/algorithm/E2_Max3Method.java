package study.algorithms.algorithm;

/**
 * 세 개의 정수 중 최댓값을 구하는 프로그램
 *
 * 미리 정의된 값을 사용하여 최댓값을 출력
 */
class E2_Max3Method {

    static int max3(int a, int b, int c) {

        int max = a;

        if (b> max) max = b;

        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {

        System.out.println("max(3, 2, 1) = " + max3(3, 2, 1));
        System.out.println("max(3, 2, 2) = " + max3(3, 2, 2));
        System.out.println("max(3, 1, 2) = " + max3(3, 1, 2));
        System.out.println("max(3, 2, 3) = " + max3(3, 2, 3));
        System.out.println("max(2, 1, 3) = " + max3(2, 1, 3));
        System.out.println("max(3, 3, 2) = " + max3(3, 3, 2));
        System.out.println("max(3, 3, 3) = " + max3(3, 3, 3));
        System.out.println("max(2, 2, 3) = " + max3(2, 2, 3));
        System.out.println("max(2, 3, 1) = " + max3(2, 3, 1));
        System.out.println("max(2, 3, 2) = " + max3(2, 3, 2));
        System.out.println("max(1, 3, 2) = " + max3(1, 3, 2));
        System.out.println("max(2, 3, 3) = " + max3(2, 3, 3));
        System.out.println("max(1, 2, 3) = " + max3(1, 2, 3));
    }
}
