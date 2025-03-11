package AceptaElReto;

import java.util.Scanner;

public class AsaltoCastillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long startTime = System.currentTimeMillis();
        while (true) {
            int hombres = sc.nextInt();

            if (hombres == 0) {
                break;
            }
            if (hombres > 0 && hombres <= 500000) {
                int totalDivisores = 0;
                for (int i = 1; i <= hombres; i++) {
                    if (hombres % i == 0) {
                        totalDivisores++;
                    }
                }
                System.out.println(totalDivisores);
            } else {
                System.out.println("Tiene que estar entre 0 y 500.000");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (endTime - startTime) + " ms");

        sc.close();
    }
}

