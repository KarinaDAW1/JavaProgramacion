package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int NOMBRE_SECRET = 22;
		int numeroUsuari;
		int vidas = 3;
		while(vidas != 0) {
		System.out.println("Introduce el numero secreto:");
		numeroUsuari = sc.nextInt();
			
		if (numeroUsuari == NOMBRE_SECRET) {
			System.out.println("Has adivinado el número secreto!"+NOMBRE_SECRET);
		}else {
			System.out.println("NO has adivinado el número secreto! Vuelve a intentarlo");
			vidas--;
			}
		
		}sc.close();
		System.out.println("Has perdido las 3 vidas, no hay más intentos.");
	}
}
