package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio5 {
	
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
		
		if(Array[0]>Array[1] && Array[1]>Array[2]) { //0 > 1 > 2
			
			System.out.println(Array[0]+" > "+Array[1]+" > "+Array[2]);
			
		}else if (Array[0]>Array[2] && Array[2]>Array[1]) { // 0 > 2 > 1
			
			System.out.println(Array[0]+" > "+Array[2]+" > "+Array[1]);
			
		}else if (Array[1]>Array[0] && Array[0]>Array[2]) { // 1 > 0 > 2
			
			System.out.println(Array[1]+" > "+Array[0]+" > "+Array[2]);
			
		}else if (Array[1]>Array[2] && Array[2]>Array[0]) { // 1 > 2 > 0
			
			System.out.println(Array[1]+" > "+Array[2]+" > "+Array[0]);
			
		}else if (Array[2]>Array[0] && Array[0]>Array[1]) { // 2 > 0 > 1
			
			System.out.println(Array[2]+" > "+Array[0]+" > "+Array[1]);
			
		}else if (Array[2]>Array[1] && Array[1]> Array[0]) { // 2 > 1 > 0
			
			System.out.println(Array[2]+" > "+Array[1]+" > "+Array[0]);
			
		}
	}

}
