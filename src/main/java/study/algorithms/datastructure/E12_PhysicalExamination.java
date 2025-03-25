package study.algorithms.datastructure;

import java.util.Scanner;


/**
 * 신체 검사 데이터를 처리하는 클래스
 */
class E12_PhysicalExamination {

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

    static double avgHeight(PhysicalData[] dat) {

        double sum = 0;

        for (int i = 0; i < dat.length; i++) {

            sum += dat[i].height;
        }

        return sum / dat.length;
    }

    static void distVision(PhysicalData[] dat, int[] dist) {

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

        PhysicalData[] x = {
                new PhysicalData("강민하", 162, 0.3),
                new PhysicalData("김찬우", 173, 0.7),
                new PhysicalData("박준서", 175, 2.0),
                new PhysicalData("유서범", 171, 1.5),
                new PhysicalData("이수연", 168, 0.4),
                new PhysicalData("장경오", 174, 1.2),
                new PhysicalData("황지안", 169, 0.8),
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
