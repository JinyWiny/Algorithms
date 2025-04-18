package study.algorithms.algorithm;

/**
 * 구구단 곱셈표를 변형하여 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요.
 */
class Q12_Add99Table {

    public static void main(String[] args) {

        System.out.println("구구단 덧셈표");

        System.out.print("   |");

        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);

        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {

            System.out.printf("%2d |", i);

            for (int j = 1; j <= 9; j++) {

                System.out.printf("%3d", i + j);
            }

            System.out.println();
        }
    }
}
