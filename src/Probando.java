import java.util.Scanner;

public class Probando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la longitud del array
        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();

        // Crear el array para almacenar las notas
        double[] notas = new double[longitud];

        // Solicitar las notas
        for (int i = 0; i < longitud; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular la nota media, máxima y mínima
        double suma = 0;
        double max = notas[0];
        double min = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > max) {
                max = nota;
            }
            if (nota < min) {
                min = nota;
            }
        }

        double media = suma / longitud;

        // Mostrar los resultados
        System.out.println("Nota media: " + media);
        System.out.println("Nota máxima: " + max);
        System.out.println("Nota mínima: " + min);
    }
}
