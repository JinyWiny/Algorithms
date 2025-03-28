package study.algorithms.datastructure;

import java.util.Scanner;
import study.algorithms.datastructure.E12_PhysicalExamination.PhysicalData;

/**
 * 시력 분포를 오른쪽처럼 그래프로 출력하도록 수정하여 프로그램을 작성하세요.
 * 기호 문자 *를 사람 수만큼 반복하여 나타내세요.
 */
class Q7_PhysicalExamination {

    static final int visionMAX = 21;

    static class PhysicalData {

        String name;
        int    height;
        double vision;

        PhysicalData(String name, int height, double vision) {

            this.name     = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double avgHeight(E12_PhysicalExamination.PhysicalData[] dat) {

        double sum = 0;

        for (int i = 0; i < dat.length; i++) {

            sum += dat[i].height;
        }

        return sum / dat.length;
    }

    static void distVision(E12_PhysicalExamination.PhysicalData[] dat, int[] dist) {

        int i = 0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {

            if (dat[i].vision >= 0.0 && dat[i].vision <= visionMAX / 10.0) {
                dist[(int) (dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        E12_PhysicalExamination.PhysicalData[] x = {
                new E12_PhysicalExamination.PhysicalData("강민하", 162, 0.3),
                new E12_PhysicalExamination.PhysicalData("김찬우", 173, 0.7),
                new E12_PhysicalExamination.PhysicalData("박준서", 175, 2.0),
                new E12_PhysicalExamination.PhysicalData("유서범", 171, 1.5),
                new E12_PhysicalExamination.PhysicalData("이수연", 168, 0.4),
                new E12_PhysicalExamination.PhysicalData("장경오", 174, 1.2),
                new E12_PhysicalExamination.PhysicalData("황지안", 169, 0.8),
        };

        int[] vdist = new int[visionMAX];

        System.out.println("신체 검사 리스트");

        System.out.println(" 이름    키   시력");
        System.out.println("--------------------");

        for (int i = 0; i < x.length; i++) {

            System.out.printf("%-6s%3d%5.1f\n",
                    x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n평균 키: %5.1fcm\n", avgHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for (int i = 0; i < visionMAX; i++)
            System.out.printf("%3.1f～: %2d명\n", i / 10.0, vdist[i]);
    }
}
