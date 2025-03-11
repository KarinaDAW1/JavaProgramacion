package EjercicioTema4;

import java.util.Scanner;

public class LetraMasRepetida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numpalabras = 0;
		int [] letras = new int [26];
		
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
		
		
		for (int i = 0; i < frase.length; i++) {
			for (int j = 0; j < frase[i].length();j++) {
				letras[frase[i].charAt(j)-'a']++;
			}
		}
		
		char letra_mas_repetida = ' ';
		int Max_Repeticiones = 0;
		
		for (int i = 0; i < letras.length;i++) {
			char letra_actual = (char) (i+97); 
			if(letras[i] > Max_Repeticiones) {
				letra_mas_repetida = (char) (i+97);
				Max_Repeticiones = letras[i];
			}
		}
		System.out.println("Letras mas repetida: "+letra_mas_repetida);
			
		
	}

}
