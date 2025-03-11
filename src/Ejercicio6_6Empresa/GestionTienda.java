package Ejercicio6_6Empresa;

import java.util.Scanner;

public class GestionTienda {
    static int longEmpleado;
    static int longClientes;
    static Empleado[] Ventas;
    static Clientes[] ClientesArray;
    static boolean salir = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (!salir) {
            System.out.println("\t<-----> MENU <----->");
            System.out.println("0. Introduce cuantos Empleados y clientes tienes");
            System.out.println("1. Introduce la información de los Empleados");
            System.out.println("2. Introduce la información de los Clientes");
            System.out.println("3. Muestra la información almacenada");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 0:
                    System.out.println("Cuantos Empleados quieres guardar?");
                    longEmpleado = sc.nextInt();
                    sc.nextLine(); // Consumir la nueva línea
                    System.out.println("Cuantos Clientes quieres guardar?");
                    longClientes = sc.nextInt();
                    sc.nextLine(); // Consumir la nueva línea
                    Ventas = new Empleado[longEmpleado];
                    ClientesArray = new Clientes[longClientes];
                    break;
                case 1:
                    System.out.println("<-----> Introduce la información de los Empleados <----->");
                    informacionEmpleado();
                    break;
                case 2:
                    System.out.println("<-----> Introduce la información de los Clientes <----->");
                    informacionClientes();
                    break;
                case 3:
                    System.out.println("<-----> Mostrando la información almacenada <----->");
                    mostrarInformacio();
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    salir = true;
                    break;
                default:
                    salir = true;
                    break;
            }
        }

        sc.close();
    }

    public static void informacionEmpleado() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Ventas.length; i++) {
            System.out.println("Escribe el nombre del empleado:");
            String nombre = sc.nextLine();
            System.out.println("Escribe el dni del empleado:");
            String dni = sc.nextLine();
            System.out.println("Escribe la edat del empleado:");
            int edat = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea
            System.out.println("Escribe la fecha de entrada del empleado:");
            String fecha_entrada = sc.nextLine();
            System.out.println("Escribe la fecha de salida del empleado");
            String fecha_salida = sc.nextLine();
            System.out.println("Escribe el sector del empleado:");
            String sector = sc.nextLine();
            System.out.println("Escribe el código del empleado:");
            int codigo = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            Ventas[i] = new Empleado(nombre, dni, edat, fecha_entrada, fecha_salida, sector, codigo);
        }
    }

    public static void informacionClientes() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ClientesArray.length; i++) {
            System.out.println("Escribe el nombre del Cliente:");
            String nombre = sc.nextLine();
            System.out.println("Escribe el dni del Cliente:");
            String dni = sc.nextLine();
            System.out.println("Escribe la edat del Cliente:");
            int edat = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea
            System.out.println("Escribe la fecha de entrada del Cliente:");
            String fecha_entrada = sc.nextLine();
            System.out.println("Escribe la fecha de salida del Cliente:");
            String fecha_salida = sc.nextLine();
            System.out.println("Escribe el producto del Cliente:");
            String producto = sc.nextLine();
            System.out.println("Escribe la forma de pago del Cliente:");
            String forma_pago = sc.nextLine();
            System.out.println("Escribe el precio del producto del Cliente:");
            double precio = sc.nextDouble();
            sc.nextLine(); // Consumir la nueva línea

            ClientesArray[i] = new Clientes(nombre, dni, edat, fecha_entrada, fecha_salida, producto, forma_pago, precio);
        }
    }

    public static void mostrarInformacio() {
        System.out.println("Primero enseñaremos la información de Empleados:");
        for (Empleado e : Ventas) {
            e.mostrarInformacio();
            System.out.println();
        }

        System.out.println("Ahora enseñaremos la información de Clientes:");
        for (Clientes c : ClientesArray) {
            c.mostrarInformacio();
            System.out.println();
        }
    }
}

