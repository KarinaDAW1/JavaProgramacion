package AceptaElReto;

import java.util.Scanner;

public class AsaltoAlCastillo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long startTime = System.currentTimeMillis();
        while (true) {
            int num = readInt(sc);
            if (num == 0) {
                break;
            }

            if (num > 3) {
                int count = 2;  // Todo número es divisible por sí mismo y por 1
                double raiz = Math.sqrt(num);

                if (raiz == Math.floor(raiz)) {
                    count++;
                }

                for (int i = 2; i < raiz; i++) {
                    if (num % i == 0) {
                        count += 2;
                    }
                }
                long endTime = System.currentTimeMillis();
                System.out.println("Tiempo total: " + (endTime - startTime) + " ms");
                System.out.println(count);
            } else if (num > 1) {
                System.out.println(2);  // num == 2, 3
            } else {
                System.out.println(1);  // num == 1
            }
        }


        sc.close();
    }

    public static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }
}
