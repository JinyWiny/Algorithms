package study.algorithms.algorithm;

/**
 * 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다.
 * 하지만 비효율적인 구조를 가지고 있어 이를 개선해야 합니다.
 *
 * static int med3(int a, int b, int c) {
 *     if ((b >= a && c <= a) || (b <= a && c >= a))
 *         return a;
 *
*      else if ((a > b && c < b) || (a < b && c > b))
 *         return b;
 *
 *     return c;
 * }
 */
class Q5_Median3_2 {

    static int med3(int a, int b, int c) {

        if ((a >= b && a <= c) || (a >= c && a <= b))
            return a;

        else if ((b >= a && b <= c) || (b >= c && b <= a))

            return b;
        return c;
    }

    public static void main(String[] args) {

        System.out.println("Median3(3, 2, 1) = " + med3(3, 2, 1));
        System.out.println("Median3(3, 2, 2) = " + med3(3, 2, 2));
        System.out.println("Median3(3, 1, 2) = " + med3(3, 1, 2));
        System.out.println("Median3(3, 2, 3) = " + med3(3, 2, 3));
        System.out.println("Median3(2, 1, 3) = " + med3(2, 1, 3));
        System.out.println("Median3(3, 3, 2) = " + med3(3, 3, 2));
        System.out.println("Median3(3, 3, 3) = " + med3(3, 3, 3));
        System.out.println("Median3(2, 2, 3) = " + med3(2, 2, 3));
        System.out.println("Median3(2, 3, 1) = " + med3(2, 3, 1));
        System.out.println("Median3(3, 2, 2) = " + med3(3, 2, 2));
        System.out.println("Median3(1, 3, 2) = " + med3(1, 3, 2));
        System.out.println("Median3(2, 3, 3) = " + med3(2, 3, 3));
        System.out.println("Median3(1, 2, 3) = " + med3(1, 2, 3));
    }
}
