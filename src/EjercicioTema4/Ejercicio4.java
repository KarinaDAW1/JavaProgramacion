package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio4 {
	
	private static Scanner lector;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = new int[3];
		
		System.out.println("Escriu el primer número: ");
		lector = new Scanner (System.in);
		Array[0] = lector.nextInt();
		System.out.println("Escriu el segon número: ");
		lector = new Scanner (System.in);
		Array[1] = lector.nextInt();
		System.out.println("Escriu el tercer número: ");
		lector = new Scanner (System.in);
		Array[2] = lector.nextInt();
		
		if(Array[0]>Array[1]&&Array[0]>Array[2]) {
			
			System.out.println("El número mas grande es: "+Array[0]);
			
		}else if(Array[1]>Array[0]&&Array[1]>Array[2]) {
			
			System.out.println("El número mas grande es: "+Array[1]);
			
		}else if(Array[2]>Array[0]&&Array[2]>Array[1]) {
			
			System.out.println("El número mas grande es: "+Array[2]);
			
		}
	}

}
