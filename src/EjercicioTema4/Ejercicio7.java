package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		int opcion;
		
		System.out.println("Escriu cuantas veces quieres que salga la barra baja por pantalla.");
		
		opcion = sc.nextInt();
		
		while(i<opcion) {
			System.out.println("_");
			i = i+1;
		}sc.close();
		System.out.println("Ya hemos escrito el total de _ que querías.");
		
	}

}
