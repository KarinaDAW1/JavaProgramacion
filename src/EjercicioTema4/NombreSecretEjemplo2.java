package EjercicioTema4;

import java.util.Scanner;

public class NombreSecretEjemplo2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			final int NOMBRE_SECRET = 22;
			int numeroUsuari;
			
			System.out.println("Introduce el numero secreto:");
			numeroUsuari = sc.nextInt();
			
			if (numeroUsuari == NOMBRE_SECRET) {
				System.out.println("Has adivinado el número secreto!");
			}else {
				System.out.println("NO has adivinado el número secreto!");
			}
		}
		System.out.println("Final del programa");
	}

}
