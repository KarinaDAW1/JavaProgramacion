package AlgorismeOrdenacio;

import java.util.Scanner;

public class ConTryCatchPropio {

    static Scanner sc = new Scanner(System.in);
    static int Llista;
    static int[] LlistaDesordenada;
    static boolean salir = false;

    public static void main(String[] args) {

        System.out.println("///////////////////////");
        System.out.println("/////JOC ORDENACIÓ/////");
        System.out.println("///////////////////////");

        while (!salir) {
            try {
                System.out.println("\nMENÚ JOC ORDENACIÓ");
                System.out.println("1. Ordenació per inserció directa.");
                System.out.println("2. Ordenació bombolla");
                System.out.println("3. Ordenació de selecció directa.");
                System.out.println("4. Ordenació per intercanvi directa.");
                System.out.println("5. Salir.");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("ORDENACIÓ PER INSERCIÓ DIRECTA.");
                        Llista = leerNumeroPositivo("Escriu quants números vols ordenar.");
                        LlistaDesordenada = leerNumeros(Llista);
                        OrdenacioInsercioDirecta(LlistaDesordenada);
                        break;

                    case 2:
                        System.out.println("ORDENACIÓ BOMBOLLA");
                        Llista = leerNumeroPositivo("Escriu quants números vols ordenar.");
                        LlistaDesordenada = leerNumeros(Llista);
                        OrdenacioBombolla();
                        break;

                    case 3:
                        System.out.println("ORDENACIÓ SELECCIÓ DIRECTA");
                        Llista = leerNumeroPositivo("Escriu quants números vols ordenar.");
                        LlistaDesordenada = leerNumeros(Llista);
                        OrdenacioSeleccioDirecta();
                        break;

                    case 4:
                        System.out.println("ORDENACIÓ INTERCANVI DIRECTA");
                        Llista = leerNumeroPositivo("Escriu quants números vols ordenar.");
                        LlistaDesordenada = leerNumeros(Llista);
                        OrdenacioIntercanviDirecta();
                        break;

                    case 5:
                        salir = true;
                        break;

                    default:
                        throw new TryException("Opció no vàlida. Introdueix un nombre de l'1 al 5.", 102);
                }
            } catch (TryException e) {
                System.out.println("Error personalitzat: " + e.toString());
            } catch (Exception e) {
                System.out.println("S'ha produït un error inesperat: " + e.getMessage());
            }
        }
    }

    private static int leerNumeroPositivo(String mensaje) throws TryException {
        System.out.println(mensaje);
        int numero = sc.nextInt();
        if (numero <= 0) {
            throw new TryException("El número d'elements ha de ser major que zero.", 101);
        }
        return numero;
    }

    private static int[] leerNumeros(int longitud) {
        int[] numeros = new int[longitud];
        System.out.println("Escriu els números:");
        for (int i = 0; i < longitud; i++) {
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    private static void OrdenacioInsercioDirecta(int[] LlistaDesordenada) {
        int n = LlistaDesordenada.length;
        for (int i = 1; i < n; i++) {
            int contador = LlistaDesordenada[i];
            int j = i - 1;
            while (j >= 0 && LlistaDesordenada[j] > contador) {
                LlistaDesordenada[j + 1] = LlistaDesordenada[j];
                j--;
            }
            LlistaDesordenada[j + 1] = contador;
        }
        System.out.println("Llista ordenada per inserció directa:");
        for (int num : LlistaDesordenada) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void OrdenacioBombolla() {
        int n = LlistaDesordenada.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (LlistaDesordenada[j] > LlistaDesordenada[j + 1]) {
                    int temp = LlistaDesordenada[j];
                    LlistaDesordenada[j] = LlistaDesordenada[j + 1];
                    LlistaDesordenada[j + 1] = temp;
                }
            }
        }
        System.out.println("Llista ordenada per bombolla:");
        for (int num : LlistaDesordenada) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void OrdenacioSeleccioDirecta() {
        int n = LlistaDesordenada.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (LlistaDesordenada[j] < LlistaDesordenada[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = LlistaDesordenada[minIdx];
            LlistaDesordenada[minIdx] = LlistaDesordenada[i];
            LlistaDesordenada[i] = temp;
        }
        System.out.println("Llista ordenada per selecció directa:");
        for (int num : LlistaDesordenada) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void OrdenacioIntercanviDirecta() {
        int n = LlistaDesordenada.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (LlistaDesordenada[i] > LlistaDesordenada[j]) {
                    int temp = LlistaDesordenada[i];
                    LlistaDesordenada[i] = LlistaDesordenada[j];
                    LlistaDesordenada[j] = temp;
                }
            }
        }
        System.out.println("Llista ordenada per intercanvi directa:");
        for (int num : LlistaDesordenada) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
