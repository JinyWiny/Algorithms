package study.algorithms.datastructure;

/**
 * 소수 판별 프로그램
 *
 * 2부터 100까지의 숫자 중에서 소수를 찾아 출력
 * 수행한 나눗셈 횟수를 출력
 */
class E7_PrimeNumber1 {

    public static void main(String[] args) {

        int counter = 0;

        for (int n = 2; n <= 100; n++) {

            int i;

            for (i = 2; i < n; i++) {

                counter++;

                if (n % i == 0)
                    break;
            }

            if (n == i) {
                System.out.println(n);
            }
        }

        System.out.println("나눗셈 횟수: " + counter);
    }
}
