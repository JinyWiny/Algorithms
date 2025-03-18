package study.algorithms.datastructure;

/**
 * 정수형 배열을 생성하고, 값 할당 후, 배열의 모든 요소를 출력하는 프로그램
 * 배열을 선언할 때 초기값을 할당
 */
class E2_IntArrayInit {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {

            System.out.println("a[" + i + "] = " +a[i]);
        }
    }
}
