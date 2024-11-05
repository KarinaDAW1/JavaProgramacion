package EjercicioTema4;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantitat;

        // Demana una quantitat d'euros vàlida
        do {
            System.out.print("Introdueix una quantitat d'euros (múltiple de 5): ");
            quantitat = scanner.nextInt();
            if (quantitat % 5 != 0) {
                System.out.println("La quantitat ha de ser un múltiple de 5. Torna a intentar-ho.");
            }
        } while (quantitat % 5 != 0);

        // Array de bitllets
        int[] bitllets = {500, 200, 100, 50, 20, 10, 5};
        System.out.println("Per " + quantitat + " € es necessiten:");

        // Calcula i imprimeix la quantitat de cada bitllet
        for (int bitllet : bitllets) {
            int quantitatBitllets = quantitat / bitllet;
            if (quantitatBitllets > 0) {
                System.out.println(quantitatBitllets + " bitllet(s) de " + bitllet + " €");
                quantitat %= bitllet; // Actualitza la quantitat restant
            }
        }

        scanner.close();
    }
}
