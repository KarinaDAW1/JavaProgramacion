package EjercicioTema2;

import java.util.Scanner;

public class Polidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        // Eliminar espacios y convertir a minúsculas para la comparación
        String fraseLimpia = frase.replaceAll("\\s+", "").toLowerCase();

        // Inicializar una variable booleana para verificar si la frase es un palíndromo
        boolean esPalindromo = true;
        int longitud = fraseLimpia.length();

        // Recorrer la frase desde el inicio y el final hacia el centro
        for (int i = 0; i < longitud / 2; i++) {
            // Comparar los caracteres correspondientes desde el inicio y el final
            if (fraseLimpia.charAt(i) != fraseLimpia.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        // Imprimir el resultado
        if (esPalindromo) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
	}

}
