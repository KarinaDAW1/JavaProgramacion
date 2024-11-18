package EjercicioTema4;

import java.util.Scanner;

public class ExamenUD4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcionmenu;
        String[] usuario = new String[10];
        String[] contraseña = new String[10];
        String[] usuarioerror = new String[10];
        String[] contraseñaerror = new String[10];
        int contador = 0;
        int indice = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("*---------------*");
            System.out.println("<<PANEL DE INGRESO>>");
            System.out.println("1- Introduce nuevo usuario y contraseña");
            System.out.println("2- Entrar al sistema");
            System.out.println("3- Salir del programa");
            System.out.println("*----------------*");

            opcionmenu = sc.nextInt();
            sc.nextLine();

            switch (opcionmenu) {
                case 1:
                    if (indice < usuario.length) {
                        System.out.println("<<>> Has elegido introduce nuevo usuario y contraseña <<>>");
                        System.out.println("Usuario:");
                        usuario[indice] = sc.nextLine();
                        System.out.println("Contraseña:");
                        contraseña[indice] = sc.nextLine();
                        indice++;
                    } else {
                        System.out.println("No se pueden agregar más usuarios.");
                    }
                    break;

                case 2:
                    System.out.println("<<>>Entrar al sistema<<>>");
                    System.out.println("Introduce el usuario:");
                    String usuarioIngresado = sc.nextLine();
                    System.out.println("Introduce la contraseña:");
                    String contraseñaIngresada = sc.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < indice; i++) {
                        if (usuario[i].equals(usuarioIngresado) && contraseña[i].equals(contraseñaIngresada)) {
                            System.out.println("Has entrado al sistema.");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        usuarioerror[contador] = usuarioIngresado;
                        contraseñaerror[contador] = contraseñaIngresada;
                        contador++;
                        System.out.println("Error. Inténtalo de nuevo.");
                    }
                    System.out.println("Has entrado al sistema. Ha habido " + contador + " intentos de entrada incorrectos.");
                    break;

                case 3:
                    System.out.println("Has decidido salir del programa.");
                    System.out.println("Te voy a enseñar todas las contraseñas y usuarios que has escrito:");
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Usuario: " + usuarioerror[i] + ", Contraseña: " + contraseñaerror[i]);
                    }
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        sc.close();
    }
}