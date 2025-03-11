package Treball;

import java.util.Scanner;

public class GestionTreball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de trabajadores: ");
        int numTrabajadores = scanner.nextInt();
        scanner.nextLine();

        Treballador[] Treballadors = new Treballador[numTrabajadores];

        for (int i = 0; i < numTrabajadores; i++) {
            System.out.println("Introduce los datos del trabajador " + (i+1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Selecciona el tipo de trabajador:");
            System.out.println("1. Ingeniero");
            System.out.println("2. Comercial");
            System.out.println("3. Administrador");
            System.out.println("4. Director");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Treballadors[i] = new Ingeniero(nombre, salario);
                    break;
                case 2:
                    Treballadors[i] = new Comercial(nombre, salario);
                    break;
                case 3:
                    Treballadors[i] = new Administrador(nombre, salario);
                    break;
                case 4:
                    Treballadors[i] = new Director(nombre, salario);
                    break;
                default:
                    System.out.println("Opción no válida. Se asignará por defecto Ingeniero.");
                    Treballadors[i] = new Ingeniero(nombre, salario);
            }
        }

        System.out.println("\nInformación de los trabajadores:");
        for (Treballador t : Treballadors) {
            System.out.println("Nombre: " + t.getNombre());
            System.out.println("Salario: " + t.getSalario());
            t.trabajar();
            t.cobrar();
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}
