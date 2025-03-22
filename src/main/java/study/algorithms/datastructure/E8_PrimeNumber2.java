package study.algorithms.datastructure;

/**
 * 소수 판별 프로그램
 *
 * 2부터 1000까지의 숫자 중에서 소수를 찾아 배열에 저장하고 출력
 * 짝수를 제외하고 홀수만 검사하여 성능을 향상
 */
class E8_PrimeNumber2 {

    public static void main(String[] args) {

        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 3; n <= 1000; n += 2) {

            int i;

            for (i = 1; i < ptr; i++) {

                counter++;

                if (n % prime[i] == 0)
                    break;
            }

            if (ptr == i) {
                prime[ptr++] = n;
            }
        }

        for (int i =0; i < ptr; i++) {

            System.out.println(prime[i]);
        }

        System.out.println("나눗셈 횟수: " + counter);
    }
}
