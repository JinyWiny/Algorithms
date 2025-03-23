package study.algorithms.datastructure;

/**
 * 향상된 for문을 사용하여 합계를 계산
 */
class E11_ArraySumForIn {

    public static void main(String[] args) {

        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {

            System.out.println("a[" + i + "]: " + a[i]);
        }

        double sum = 0;

        for (double i: a) {

            sum += i;
        }

        System.out.println("sum: " + sum);
    }
}
