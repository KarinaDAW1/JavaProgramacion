package AlgorismeOrdenacio;

import java.util.Scanner;

public class EjercicioAlgorismeOrdenacionString {
    private static final int MAX_PERSONAS = 100;
    private static Persona[] personas = new Persona[MAX_PERSONAS];
    private static int totalPersonas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            try {
                opcion = obtenerOpcion();
                switch (opcion) {
                    case 1:
                        introducirNuevaPersona();
                        break;
                    case 2:
                        mostrarPersonasPorOrdenLlegada();
                        break;
                    case 3:
                        mostrarPersonasPorNombre();
                        break;
                    case 4:
                        mostrarPersonasPorApellido();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, introduzca un número entero para la opción del menú.");
                opcion = 0; // Restablece la opción para volver a solicitarla
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Introducir nueva persona");
        System.out.println("2. Mostrar la lista de personas por orden de llegada");
        System.out.println("3. Mostrar lista de personas en orden alfabético por nombre");
        System.out.println("4. Mostrar lista de personas en orden alfabético por apellido");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int obtenerOpcion() throws NumberFormatException {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void introducirNuevaPersona() {
        if (totalPersonas < MAX_PERSONAS) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            Persona nuevaPersona = new Persona(nombre, apellido);
            personas[totalPersonas] = nuevaPersona;
            totalPersonas++;
            System.out.println("Persona registrada exitosamente.");
        } else {
            System.out.println("No se pueden agregar más personas. El límite ha sido alcanzado.");
        }
    }

    private static void mostrarPersonasPorOrdenLlegada() {
        if (totalPersonas == 0) {
            System.out.println("No hay personas registradas.");
            return;
        }

        System.out.println("Lista de personas por orden de llegada:");
        for (int i = 0; i < totalPersonas; i++) {
            System.out.println((i + 1) + ". " + personas[i].getNombre() + " " + personas[i].getApellido());
        }
    }

    private static void mostrarPersonasPorNombre() {
        if (totalPersonas == 0) {
            System.out.println("No hay personas registradas.");
            return;
        }

        // Copiar el array de personas para no modificar el original
        Persona[] personasCopia = personas.clone();

        // Ordenar personas por nombre en orden alfabético (método de selección directa)
        for (int i = 0; i < totalPersonas - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < totalPersonas; j++) {
                if (personasCopia[j].getNombre().compareTo(personasCopia[minIndex].getNombre()) < 0) {
                    minIndex = j;
                }
            }
            Persona temp = personasCopia[i];
            personasCopia[i] = personasCopia[minIndex];
            personasCopia[minIndex] = temp;
        }

        System.out.println("Lista de personas en orden alfabético por nombre:");
        for (int i = 0; i < totalPersonas; i++) {
            System.out.println((i + 1) + ". " + personasCopia[i].getNombre() + " " + personasCopia[i].getApellido());
        }
    }

    private static void mostrarPersonasPorApellido() {
        if (totalPersonas == 0) {
            System.out.println("No hay personas registradas.");
            return;
        }

        // Copiar el array de personas para no modificar el original
        Persona[] personasCopia = personas.clone();

        // Ordenar personas por apellido en orden alfabético (método de la burbuja)
        for (int i = 0; i < totalPersonas - 1; i++) {
            for (int j = 0; j < totalPersonas - i - 1; j++) {
                if (personasCopia[j].getApellido().compareTo(personasCopia[j + 1].getApellido()) > 0) {
                    Persona temp = personasCopia[j];
                    personasCopia[j] = personasCopia[j + 1];
                    personasCopia[j + 1] = temp;
                }
            }
        }

        System.out.println("Lista de personas en orden alfabético por apellido:");
        for (int i = 0; i < totalPersonas; i++) {
            System.out.println((i + 1) + ". " + personasCopia[i].getNombre() + " " + personasCopia[i].getApellido());
        }
    }
}

class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
