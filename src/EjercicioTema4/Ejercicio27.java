package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numpalabras = 0;

		System.out.println("Dime cuantas palabras vas a escribir");
		numpalabras = sc.nextInt();
		sc.nextLine();
		String [] frase = new String [numpalabras];
		
		System.out.println("Escribe las palabras para rellenar el Array:");
		for(int i = 0; i < numpalabras ; i++) {
			frase[i] = sc.nextLine().toLowerCase();
		}
	
		System.out.println("Has escrito:");
		for (int i = 0 ; i < frase.length; i++) {
			System.out.println(frase[i]);
		}
		
		String palabras_mas_vocal = "";
		int num_vocales_max = 0;
		
		for (int i = 0; i < frase.length; i++) {
			int num_vocales_actual = 0;
			for (int j = 0; j < frase[i].length();j++) {
				if(frase[i].charAt(j)=='a' || frase[i].charAt(j)=='e' ||
				   frase[i].charAt(j)=='i' || frase[i].charAt(j)=='o' || frase[i].charAt(j)=='u') {
					num_vocales_actual++;
					if(num_vocales_actual > num_vocales_max) {
						palabras_mas_vocal = frase[i];
						num_vocales_max = num_vocales_actual;
					}
				}
			}
		}sc.close();
		System.out.println("La palabra con más vocales es: "+palabras_mas_vocal);
	}
}