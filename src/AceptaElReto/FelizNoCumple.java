package AceptaElReto;

import java.util.Scanner;

public class FelizNoCumple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int anyo = sc.nextInt();
            int diaHoy = sc.nextInt();
            int mesHoy = sc.nextInt();
            int anyoHoy = sc.nextInt();

            if (dia == 0 && mes == 0 && anyo == 0 && diaHoy == 0 && mesHoy == 0 && anyoHoy == 0) {
                return;
            }

            if (dia == diaHoy && mes == mesHoy) {
                System.out.println("0");
            } else {
                long suma1 = anyo * 365 + dia;
                for (int i = 0; i < mes - 1; i++) {
                    suma1 = suma1 + meses[i];
                }
                long suma2 = anyoHoy * 365 + diaHoy;
                for (int i = 0; i < mesHoy - 1; i++) {
                    suma2 = suma2 + meses[i];
                }
                long suma = suma2 - suma1 - (anyoHoy - anyo - 1);
                if ((diaHoy > dia && mesHoy == mes) || (mesHoy > mes)) {
                    suma--;
                }
                System.out.println(suma);
            }
        }
    }
}