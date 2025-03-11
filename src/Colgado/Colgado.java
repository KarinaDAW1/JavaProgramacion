package Colgado;

import java.util.Scanner;
import java.util.Random;

public class Colgado {

    static boolean salir = false;
    static String palabraIntento;
    static String[] colgadoDibujo = {
            "  ____  ",
            " /   |  ",
            " |   O  ",
            " |  /|\\",
            " |  / \\",
            "_|_     "};
    static String[] palabras = {"Jirafa", "Arbol", "Buho", "Piruleta", "Gato"};
    static int vidas = 5;
    static int contador = 0;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static int randomIndex = random.nextInt(palabras.length);
    static String randomPalabra = palabras[randomIndex];
    static String palabraActual;
    static String lletresFallades;

    public static void main(String[] args) {
        System.out.println("///////////////////////////");
        System.out.println("//// JUEGO DEL COLGADO ////");
        System.out.println("///////////////////////////");

        iniciarJuego();

        while (!salir) {

            System.out.println("\nLa palabra aleatoria tiene " + randomPalabra.length() + " letras.");
            System.out.println("Palabra actual: " + palabraActual);
            System.out.println("Lletres fallades: " + lletresFallades);
            System.out.println("\nEscribe una letra:");

            palabraIntento = sc.nextLine();

            if (palabraIntento.length() == 1) {
                char letra = palabraIntento.charAt(0);
                boolean encontrada = false;
                char[] palabraArray = randomPalabra.toCharArray();
                char[] palabraActualArray = palabraActual.toCharArray(); 

               // Recorremos las letras y si encuentra una de las letras de la palabra, la almacena.
                for (int i = 0; i < palabraArray.length; i++) {
                    if (palabraArray[i] == letra) {
                        palabraActualArray[i] = letra; 
                        encontrada = true;
                    }
                }

                // Aqui convertimos en String nuevamente
                palabraActual = new String(palabraActualArray);
                
                // Aquí hacemos comprobaciones, si la letra ha sido acertada te avisará y la añadirá al array de letra.
                if (encontrada) {
                    System.out.println("Has acertado una letra");
                } else {
                    boolean yaIntentada = false;
                    for (int i = 0; i < lletresFallades.length(); i++) {
                    	
                        if (lletresFallades.charAt(i) == letra) {
                        	
                            yaIntentada = true;
                            break;
                        }
                    }

                    if (!yaIntentada) {
                        lletresFallades = lletresFallades + letra + " ";
                        vidas--;
                        contador++;
                        System.out.println("Letra Incorrecta");
                    }
                }
            } else {
                System.out.println("Solo puedes ingresar letras");
            }

            if (palabraActual.equals(randomPalabra)) {
            	
                System.out.println("FELICIDADES, HAS GANADO");
                salir = true;
                
            } else {
            	
                dibujarColgado();
                
                if (vidas == 0) {
                    System.out.println("Has agotado las vidas, has perdido");
                    salir = true;
                } else {
                    System.out.println("Te quedan " + vidas + " vidas.");
                }
            }
        }
    }
    
    //Funcion para que ponga la cantidad de _ según la cantidad de letras de la palabra del Array que ha escogido de forma Random.
    public static void iniciarJuego() {
        palabraActual = "";
        lletresFallades = "";
        for (int i = 0; i < randomPalabra.length(); i++) {
            palabraActual += "_";
        }
    }
    
    // Función para ir dibujando al colgado si el contador es más grande o igual a i
    public static void dibujarColgado() {
        for (int i = 0; i <= contador && i < colgadoDibujo.length; i++) {
            System.out.println(colgadoDibujo[i]);
        }
    }
}
