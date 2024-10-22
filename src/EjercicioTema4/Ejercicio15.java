package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num=0;
		System.out.println("Añade un números enteros y te dibujaré un triangulo.");
		if(sc.hasNextInt()==true) {
			num = sc.nextInt();
		}
		else {
			System.out.println("Has introducido un String, solamente acepta números enteros!");
		}
		
		for(int i = 1;i<=num;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("a");
				
				
				
			}
			System.out.println();
			
		}
	}
}
