package Biblioteca;

import java.util.Scanner;

public class Biblioteca {
    static boolean salir = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArmariLlibres aventura = new ArmariLlibres();
        ArmariLlibres sciFi = new ArmariLlibres();
        ArmariLlibres miedo = new ArmariLlibres();

        while (!salir) {
            System.out.println("\t<-----> MENÚ BIBLIOTECA <----->");
            System.out.println("0. Insertar Llibre");
            System.out.println("1. Eliminar Llibre");
            System.out.println("2. Modificar Llibre");
            System.out.println("3. Mostrar Llibres");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Has elegido insertar libro:");
                    System.out.println("------------------------------");
                    System.out.print("Introduce el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Introduce la categoría del libro:  (aventura, scifi o miedo)");
                    String categoria = sc.nextLine();
                    System.out.print("Introduce el año de creación del libro: ");
                    int añoCreacio = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Introduce la editorial del libro: ");
                    String editorial = sc.nextLine();
                    
                    Llibre nuevoLlibre = new Llibre(titulo, autor, categoria, añoCreacio, editorial);
                    switch (categoria.toLowerCase()) {
                        case "aventura":
                            aventura.InsertarLlibre(nuevoLlibre);
                            break;
                        case "scifi":
                            sciFi.InsertarLlibre(nuevoLlibre);
                            break;
                        case "miedo":
                            miedo.InsertarLlibre(nuevoLlibre);
                            break;
                        default:
                            System.out.println("Categoría no reconocida.");
                            break;
                    }
                    break;

                case 1:
                    System.out.println("Has elegido eliminar libro:");
                    System.out.println("-------------------------------");
                    System.out.print("Introduce el título del libro: ");
                    titulo = sc.nextLine();
                    System.out.print("Introduce la categoría del libro: (aventura, scifi o miedo)");
                    categoria = sc.nextLine();
                    
                    switch (categoria.toLowerCase()) {
                        case "aventura":
                            aventura.EliminarLlibre(titulo);
                            break;
                        case "scifi":
                            sciFi.EliminarLlibre(titulo);
                            break;
                        case "miedo":
                            miedo.EliminarLlibre(titulo);
                            break;
                        default:
                            System.out.println("Categoría no reconocida.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Has elegido modificar libro:");
                    System.out.println("------------------------------");
                    System.out.print("Introduce qué título quieres modificar: ");
                    titulo = sc.nextLine();
                    System.out.print("Introduce el nuevo título del libro: ");
                    String titulonuevo = sc.nextLine();
                    System.out.print("Introduce el nuevo autor del libro: ");
                    String autornuevo = sc.nextLine();
                    System.out.print("Introduce la nueva categoría: ");
                    String categorianueva = sc.nextLine();
                    System.out.print("Introduce el nuevo año de creación: ");
                    int añonuevocreacion = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Introduce la nueva editorial: ");
                    String editorialnueva = sc.nextLine();
                    
                    Llibre libroActualizado = new Llibre(titulonuevo, autornuevo, categorianueva, añonuevocreacion, editorialnueva);
                    switch (categorianueva.toLowerCase()) {
                        case "aventura":
                            aventura.ModificarLlibre(titulo, libroActualizado);
                            break;
                        case "scifi":
                            sciFi.ModificarLlibre(titulo, libroActualizado);
                            break;
                        case "miedo":
                            miedo.ModificarLlibre(titulo, libroActualizado);
                            break;
                        default:
                            System.out.println("Categoría no reconocida.");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Has elegido mostrar libros:");
                    System.out.println("------------------------------");
                    System.out.print("Introduce la categoría de los libros a mostrar:  (aventura, scifi o miedo)");
                    categoria = sc.nextLine();
                    
                    switch (categoria.toLowerCase()) {
                        case "aventura":
                            aventura.MostrarLlibres();
                            break;
                        case "scifi":
                            sciFi.MostrarLlibres();
                            break;
                        case "miedo":
                            miedo.MostrarLlibres();
                            break;
                        default:
                            System.out.println("Categoría no reconocida.");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elige una opción correcta.");
                    break;
            }
        }

        sc.close();
    }
}

