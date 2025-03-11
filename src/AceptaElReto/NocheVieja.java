package AceptaElReto;

import java.util.Scanner;

public class NocheVieja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MINUTOS_DIA = 24 * 60;

        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equals("00:00")) {
                break;
            }

            int horas = Integer.parseInt(entrada.split(":")[0]);
            int minutos = Integer.parseInt(entrada.split(":")[1]);

            int minutosRestantes = MINUTOS_DIA - (horas * 60 + minutos);
            System.out.println(minutosRestantes);
        }
    }
}
