package ExamenAnterior;

import java.util.Scanner;

public class Inventario {
    // Array para almacenar los electrodomésticos
    private static Electrodomestico[] inventario = new Electrodomestico[100];
    private static int contador = 0; // Contador para llevar la cuenta de los electrodomésticos almacenados

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu(); // Mostrar el menú de opciones
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            switch (opcion) {
                case 1:
                    introducirNuevoDispositivo(scanner); // Opción para introducir un nuevo dispositivo
                    break;
                case 2:
                    mostrarDispositivos(Nevera.class); // Opción para mostrar todas las neveras
                    break;
                case 3:
                    mostrarDispositivos(Lavadora.class); // Opción para mostrar todas las lavadoras
                    break;
                case 4:
                    mostrarDispositivos(null); // Opción para mostrar todos los electrodomésticos
                    break;
                case 5:
                    mostrarCantidadDispositivos(); // Opción para mostrar la cantidad de dispositivos de cada tipo
                    break;
                case 6:
                    mostrarPrecioSumado(Nevera.class); // Opción para mostrar el precio sumado de todas las neveras
                    break;
                case 7:
                    mostrarPrecioSumado(Lavadora.class); // Opción para mostrar el precio sumado de todas las lavadoras
                    break;
                case 8:
                    mostrarPrecioSumado(null); // Opción para mostrar el precio sumado de todos los electrodomésticos
                    break;
                case 9:
                    enviarAReparar(scanner); // Opción para enviar un electrodoméstico a reparar
                    break;
                case 0:
                    System.out.println("Saliendo del programa..."); // Opción para salir del programa
                    break;
                default:
                    System.out.println("Opción no válida."); // Mensaje para opción no válida
            }
        } while (opcion != 0); // Repetir el menú hasta que se seleccione la opción de salir
    }

    private static void mostrarMenu() {
        System.out.println("Menú Inventario:");
        System.out.println("1. Introducir un nuevo dispositivo");
        System.out.println("2. Mostrar todas las neveras");
        System.out.println("3. Mostrar todas las lavadoras");
        System.out.println("4. Mostrar todos los electrodomésticos");
        System.out.println("5. Mostrar cuántos electrodomésticos hay de cada tipo y el número total");
        System.out.println("6. Mostrar el precio sumado de todas las neveras");
        System.out.println("7. Mostrar el precio sumado de todas las lavadoras");
        System.out.println("8. Mostrar el precio sumado de todos los electrodomésticos");
        System.out.println("9. Enviar un electrodoméstico a reparar");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void introducirNuevoDispositivo(Scanner scanner) {
        System.out.print("Ingrese el tipo de dispositivo (Nevera/Lavadora): ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el consumo energético: ");
        double consumo = scanner.nextDouble();

        Electrodomestico dispositivo = null;
        if (tipo.equalsIgnoreCase("Nevera")) {
            System.out.print("Ingrese la capacidad: ");
            double capacidad = scanner.nextDouble();
            dispositivo = new Nevera(marca, precio, consumo, capacidad); // Crear una nueva nevera
        } else if (tipo.equalsIgnoreCase("Lavadora")) {
            System.out.print("Ingrese la carga: ");
            int carga = scanner.nextInt();
            dispositivo = new Lavadora(marca, precio, consumo, carga); // Crear una nueva lavadora
        }

        if (dispositivo != null) {
            inventario[contador++] = dispositivo; // Añadir el dispositivo al inventario
            System.out.println("Dispositivo añadido correctamente.");
        } else {
            System.out.println("Tipo de dispositivo no válido.");
        }
    }

    private static void mostrarDispositivos(Class<?> tipo) {
        for (int i = 0; i < contador; i++) {
            if (tipo == null || tipo.isInstance(inventario[i])) {
                System.out.println(inventario[i]); // Mostrar el dispositivo si es del tipo especificado o si se muestran todos
            }
        }
    }

    private static void mostrarCantidadDispositivos() {
        int countNeveras = 0;
        int countLavadoras = 0;
        for (int i = 0; i < contador; i++) {
            if (inventario[i] instanceof Nevera) {
                countNeveras++; // Contar las neveras
            } else if (inventario[i] instanceof Lavadora) {
                countLavadoras++; // Contar las lavadoras
            }
        }
        System.out.println("Neveras: " + countNeveras);
        System.out.println("Lavadoras: " + countLavadoras);
        System.out.println("Total: " + (countNeveras + countLavadoras)); // Mostrar el total de dispositivos
    }

    private static void mostrarPrecioSumado(Class<?> tipo) {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            if (tipo == null || tipo.isInstance(inventario[i])) {
                total += inventario[i].getPrecio(); // Sumar el precio del dispositivo si es del tipo especificado o si se suman todos
            }
        }
        if (tipo == null) {
            System.out.println("Precio total de todos los electrodomésticos: " + total);
        } else {
            System.out.println("Precio total de todas las " + tipo.getSimpleName() + "s: " + total); // Mostrar el precio sumado
        }
    }

    private static void enviarAReparar(Scanner scanner) {
        System.out.print("Ingrese el índice del dispositivo a reparar (0 a " + (contador - 1) + "): ");
        int indice = scanner.nextInt();
        System.out.print("Ingrese el número de horas de reparación: ");
        int horas = scanner.nextInt();
        Electrodomestico dispositivo = inventario[indice];
        if (dispositivo instanceof EnReparacion) {
            double costoReparacion = ((EnReparacion) dispositivo).reparar(horas);
            System.out.println("Se ha enviado la " + dispositivo.getClass().getSimpleName() + " no " + indice +
                    " a reparar durante " + horas + " horas: Precio " + costoReparacion + "€"); // Mostrar el costo de la reparación
        } else {
            System.out.println("El dispositivo seleccionado no se puede reparar.");
        }
    }
}
