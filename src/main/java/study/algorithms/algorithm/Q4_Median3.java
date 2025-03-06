package study.algorithms.algorithm;

/**
 * 세 값의 대소 관계인 13가지 조합의 중앙값을 구하여 출력하는 프로그램을 작성하세요.
 */
class Q4_Median3 {

    static int Median3(int a, int b, int c) {

        if ( a >= b)

            if ( b >= c)
                return b;

            else if (a <= c)
                return a;

            else
                return c;

        else if (a > c)
            return a;

        else if (b > c)
            return c;

        else
            return c;
    }

    public static void main(String[] args) {

        System.out.println("Median3(3, 2, 1) = " + Median3(3, 2, 1));
        System.out.println("Median3(3, 2, 2) = " + Median3(3, 2, 2));
        System.out.println("Median3(3, 1, 2) = " + Median3(3, 1, 2));
        System.out.println("Median3(3, 2, 3) = " + Median3(3, 2, 3));
        System.out.println("Median3(2, 1, 3) = " + Median3(2, 1, 3));
        System.out.println("Median3(3, 3, 2) = " + Median3(3, 3, 2));
        System.out.println("Median3(3, 3, 3) = " + Median3(3, 3, 3));
        System.out.println("Median3(2, 2, 3) = " + Median3(2, 2, 3));
        System.out.println("Median3(2, 3, 1) = " + Median3(2, 3, 1));
        System.out.println("Median3(3, 2, 2) = " + Median3(3, 2, 2));
        System.out.println("Median3(1, 3, 2) = " + Median3(1, 3, 2));
        System.out.println("Median3(2, 3, 3) = " + Median3(2, 3, 3));
        System.out.println("Median3(1, 2, 3) = " + Median3(1, 2, 3));
    }
}
