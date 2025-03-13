package GestorPuntuacio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionPuntuacion {

    static boolean salir = false;
    static boolean control = true;
    static Scanner sc = new Scanner(System.in);
    static Puntuacio[] Llista = new Puntuacio[100];  

    public static void main(String[] args) {
        System.out.println("//////Sistema de Ordenació/////");
        while (!salir) {
            System.out.println("1. Introducir nova puntuació");
            System.out.println("2. Mostrar la llista de puntuacions per ordre d'arribada.");
            System.out.println("3. Mostrar puntuacions en ordre descendent de punts (Metodo selecció directe)");
            System.out.println("4. Mostrar llista de puntuacions en ordre alfabètic de cognom (Mètodo de bombolla)");
            System.out.println("5. Sortir");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    IntroduirPuntuacion();
                    break;
                case 2:
                    MostrarLlistaPuntuacioEnOrdre();
                    break;
                case 3:
                    MostrarPuntuacioDescendent();
                    break;
                case 4:
                    MostrarPuntuacioOrdreCognom();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Selecciona un valor valido.");
            }
        }
    }

    private static void IntroduirPuntuacion() {
        String Nom = null;
        String Cognoms = null;
        String Data = null;
        int Punts = 0;

        try {
            System.out.println("Introduce el Nom del jugador:");
            Nom = sc.nextLine();
            System.out.println("Introduce el Cognom del jugador:");
            Cognoms = sc.nextLine();
            System.out.println("Introduce la puntuación:");
            Punts = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la data:");
            Data = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("No has introducido los valores correspondientes.");
            sc.nextLine();
            control = false;
        }

        if (!control) {
            control = true;
            return; 
        } else {
            for (int i = 0; i < Llista.length; i++) {
                if (Llista[i] == null) {
                    Llista[i] = new Puntuacio(Nom, Cognoms, Punts, Data);
                    System.out.println("Puntuación agregada: " + Llista[i]);
                    break;
                }
            }
        }
    }


    private static void MostrarLlistaPuntuacioEnOrdre() {
        System.out.println("Llista de puntuacions per ordre d'arribada:");
        for (Puntuacio p : Llista) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }
    
    private static void MostrarPuntuacioDescendent() {
        System.out.println("Puntuacions en ordre descendent de punts:");
        // Copia el array
        Puntuacio[] copia = Llista.clone();
        // Ordena por selección directa
        for (int i = 0; i < copia.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < copia.length; j++) {
                if (copia[j] != null && copia[maxIndex] != null && copia[j].getPunts() > copia[maxIndex].getPunts()) {
                    maxIndex = j;
                }
            }
            Puntuacio temp = copia[i];
            copia[i] = copia[maxIndex];
            copia[maxIndex] = temp;
        }
        
        for (Puntuacio p : copia) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    private static void MostrarPuntuacioOrdreCognom() {
        System.out.println("Puntuacions en ordre alfabètic de cognom:");

        // Copia el array
        Puntuacio[] copia = Llista.clone();

        // Ordena por método de la burbuja con manejo de excepciones
        try {
            for (int i = 0; i < copia.length - 1; i++) {
                for (int j = 0; j < copia.length - i - 1; j++) {
                    if (copia[j] != null && copia[j + 1] != null &&
                        copia[j].getCognoms().compareTo(copia[j + 1].getCognoms()) > 0) {
                        
                        // Intercambio
                        Puntuacio temp = copia[j];
                        copia[j] = copia[j + 1];
                        copia[j + 1] = temp;
                    }
                }
            }
        } catch (NullPointerException e) {
        	//NullPointerException , si la cadena es nula, se lanza NullPointerException.
            System.out.println("Error: Se intentó comparar un valor nulo.");
        } catch (ClassCastException e) {
        	//ClassCastException , si el objeto no se puede comparar, devuelve esta excepción.
            System.out.println("Error: Se intentó comparar objetos incompatibles.");
        }

        // Imprime el resultado
        for (Puntuacio p : copia) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public static class Puntuacio {
        private String Nom;
        private String Cognoms;
        private int Punts;
        private String Data;

        public Puntuacio(String Nom, String Cognoms, int Punts, String Data) {
            this.Nom = Nom;
            this.Cognoms = Cognoms;
            this.Punts = Punts;
            this.Data = Data;
        }

        public String getNom() {
            return Nom;
        }

        public String getCognoms() {
            return Cognoms;
        }

        public int getPunts() {
            return Punts;
        }

        public String getData() {
            return Data;
        }

        @Override
        public String toString() {
            return "[| Nom = " + getNom() + ", Cognoms = " + getCognoms() + ", Puntuacio = " + getPunts() + ", Data= " + getData() + " |]";
        }
    }
}

