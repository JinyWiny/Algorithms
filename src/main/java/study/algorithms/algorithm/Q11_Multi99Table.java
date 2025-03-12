package study.algorithms.algorithm;

/**
 * 위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표를 출력하는 프로그램을 작성하세요.
 */
class Q11_Multi99Table {

    public static void main(String[] args) {

        System.out.println("구구단 곱셈표");

        System.out.print("   |");

        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);

        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {

            System.out.printf("%2d |", i);

            for (int j = 1; j <= 9; j++) {

                System.out.printf("%3d", i * j);
            }

            System.out.println();
        }
    }
}
