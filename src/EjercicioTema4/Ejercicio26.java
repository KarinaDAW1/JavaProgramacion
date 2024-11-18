package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entrar un text. Trobar quina lletra és la que més surt i quantes vegades surt.
		Scanner sc = new Scanner (System.in);
		String texto;
		char[]  letras = new char[26];
		int [] veces = new int[26];
		int contador = 0;
		char Frecuente = ' ';
		
		//remplace(" ","");
		
		System.out.println("Introduce un texto y te diré que caracter se utiliza más");
		texto = sc.nextLine().toLowerCase();
		
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			
			
			if (letra >= 'a' && letra <= 'z') {
				int index = letra - 'a';
				veces[index]++;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if(veces[i] > contador) {
				contador = veces[i];
				Frecuente = letras[i];
			}
		}
		
		if (contador > 0) {
			System.out.println("La letra que mas sale es: "+Frecuente+" un total de: "+contador+" veces.");
		}else {
			System.out.println("No hay letras");
		}
		
		
	}
	

}
