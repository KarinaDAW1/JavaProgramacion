package Mastermind;

import java.util.Scanner;

public class GestioMastermind {

    static boolean salir = false;
    static int conteo = 1;
    static Scanner sc = new Scanner(System.in);
    static Partida[] Llista = new Partida[100];  
    static int partidaContador = 0; 

    public static void main(String[] args) {

        while (!salir) {
            System.out.println("////////////////////////////////");
            System.out.println("///// MENU DE MASTERMIND //////");
            System.out.println("////////////////////////////////");
            System.out.println("Que vols fer?");
            System.out.println("1. Jugar");
            System.out.println("2. Mostrar llista de partides");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("////////////////////////////////");
                    System.out.println("///// JUEGO DEL MASTERMIND /////");
                    System.out.println("////////////////////////////////");
                    System.out.print("Ingresa tu nombre: ");
                    String Nom_usuari = sc.nextLine();

                    // Aquí almaceno el nombre del jugador en la variable Nom_usuari local y la paso a la clase Partida.
                    Partida partida = new Partida(Nom_usuari);
                    System.out.println("Generando combinación secreta...");
                    // Esta parte es para poder ver la combinación e ir haciendo pruebas de acierto y error.
                    System.out.println("Combinación Secreta: " + String.valueOf(partida.getCombinacioSecreta()));

                    // Estat_final está en false y getIntents es de 16. Si no se cumple ninguna de estas dos, no saldrás del while.
                    while (!partida.isEstat_final() && partida.getIntents() < 16) {
                        System.out.println("Sólamente puedes utilizar 'R', 'B', 'G', 'M', 'Y', 'C'");
                        System.out.println("Ingresa tu tirada (4 letras, ej. 'RGBY'): ");
                        System.out.println("Tirada número: " + conteo);
                        conteo++;

                        String tiradaUsuario = sc.nextLine().toUpperCase();

                        char[] tirada = tiradaUsuario.toCharArray();
                        Tirada tiradaObj = new Tirada(tirada);
                        int[] respuesta = partida.Comprovar(tiradaObj);

                        // Mostrar el resultado (aciertos y aciertos mal colocados)
                        System.out.println("[" + respuesta[0] + " " + respuesta[1] + "]");
                        // Mostrar la puntuación
                        System.out.println("Puntuación: " + partida.getPuntuacio());

                        // Verifica si se ha ganado o perdido
                        if (partida.isEstat_final()) {
                            System.out.println("Has ganado, era " + String.valueOf(partida.getCombinacioSecreta()));
                        } else if (partida.getIntents() >= 16) {
                            System.out.println("Has perdido. La combinación secreta era: " +
                                    String.valueOf(partida.getCombinacioSecreta()));
                        }
                    }

                    Llista[partidaContador++] = partida;
                    break;

                case 2:
                    MostrarPartidas();
                    break;

                case 3:
                    salir = true; 
                    break;

                default:
                    System.out.println("Vuelve a intentarlo.");
            }
        }

        sc.close();  
    }

    private static void MostrarPartidas() {
        System.out.println("Lista de Partidas:");
        if (partidaContador == 0) {
            System.out.println("No hay partidas jugadas.");
        } else {
            for (int i = 0; i < partidaContador; i++) {
                Partida p = Llista[i];
                System.out.println("Jugador: " + p.getNom_usuari() + ", Puntuación: " + p.getPuntuacio());
            }
        }
    }
}

