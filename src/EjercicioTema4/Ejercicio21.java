package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] billetes = {500, 200, 100, 50, 20, 10, 5};
		System.out.print("Introduce una cantidad de euros. (Tiene que ser multiple de 5€)");
		int cantidad = sc.nextInt();
		
		if(cantidad % 5 != 0) {
			System.out.println("Este número no es multiple de 5, introduce otro número.");
				
		}
		
	}

}
