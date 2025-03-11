package Hotel;

import java.util.Scanner;

public class GestionHotel {

    static boolean salir = false;
    static Reserva[] Reservas = new Reserva[50];
    static int numReservas = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (!salir) {
            System.out.println("MENU DE GESTION DEL HOTEL");
            System.out.println("1. Crear reserva de clientes.");
            System.out.println("2. Eliminar reserva de clientes.");
            System.out.println("3. Mostrar todas las reservas de clientes.");
            System.out.println("4. Buscar reserva especifica de cliente.");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    crearReserva();
                    break;
                case 2:
                    eliminarReserva();
                    break;
                case 3:
                    mostrarReservas();
                    break;
                case 4:
                    buscarReserva();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        sc.close();
    }

    public static void crearReserva() {
        if (numReservas >= Reservas.length) {
            System.out.println("No se pueden agregar más reservas.");
            return;
        }

        System.out.print("Introduce el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el DNI del cliente: ");
        String dni = sc.nextLine();
        System.out.print("Introduce el número telefónico del cliente: ");
        int numerotelefonico = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el correo electrónico del cliente: ");
        String correo = sc.nextLine();
        Cliente cliente = new Cliente(nombre, dni, numerotelefonico, correo);

        System.out.print("Introduce el número de la habitación: ");
        String numHab = sc.nextLine();
        System.out.print("Introduce el tipo de habitación (Normal/Premium): ");
        String tipo = sc.nextLine();
        System.out.print("Introduce el precio por noche: ");
        double precioPorNoche = sc.nextDouble();
        sc.nextLine();

        Habitacion habitacion;
        if (tipo.equalsIgnoreCase("Normal")) {
            System.out.print("¿Tiene balcón? (true/false): ");
            boolean balcon = sc.nextBoolean();
            sc.nextLine();
            System.out.print("Introduce el número de camas: ");
            int numCamas = sc.nextInt();
            sc.nextLine();
            habitacion = new HabitacionNormal(numHab, tipo, precioPorNoche, balcon, numCamas);
        } else if (tipo.equalsIgnoreCase("Premium")) {
            System.out.print("¿Tiene sauna? (true/false): ");
            boolean sauna = sc.nextBoolean();
            sc.nextLine();
            System.out.print("Introduce el número de camas: ");
            int numCamas = sc.nextInt();
            sc.nextLine();
            habitacion = new HabitacionPremium(numHab, tipo, precioPorNoche, sauna, numCamas);
        } else {
            System.out.println("Tipo de habitación no válido.");
            return;
        }

        System.out.print("Introduce la fecha de inicio de la reserva: ");
        String fechaInicio = sc.nextLine();
        System.out.print("Introduce la fecha de fin de la reserva: ");
        String fechaFinal = sc.nextLine();

        Reservas[numReservas++] = new Reserva(cliente, habitacion, fechaInicio, fechaFinal);
        System.out.println("Reserva creada con éxito.");
    }

    public static void eliminarReserva() {
        System.out.print("Introduce el nombre del cliente para eliminar la reserva: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < numReservas; i++) {
            if (Reservas[i].getCliente().getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < numReservas - 1; j++) {
                    Reservas[j] = Reservas[j + 1];
                }
                Reservas[--numReservas] = null;
                System.out.println("Reserva eliminada con éxito.");
                return;
            }
        }
        System.out.println("Reserva no encontrada.");
    }

    public static void mostrarReservas() {
        if (numReservas == 0) {
            System.out.println("No hay reservas.");
            return;
        }
        for (int i = 0; i < numReservas; i++) {
            System.out.println(Reservas[i]);
        }
    }

    public static void buscarReserva() {
        System.out.print("Introduce el nombre del cliente para buscar la reserva: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < numReservas; i++) {
            if (Reservas[i].getCliente().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(Reservas[i]);
                return;
            }
        }
        System.out.println("Reserva no encontrada.");
    }
}

