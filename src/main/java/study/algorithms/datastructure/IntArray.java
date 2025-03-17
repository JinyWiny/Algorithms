package study.algorithms.datastructure;

/**
 * 정수형 배열을 생성하고, 값 할당 후, 배열의 모든 요소를 출력하는 프로그램
 */
class IntArray {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length; i++) {

            System.out.println("a[" + i + "] = " +a[i]);
        }
    }
}
