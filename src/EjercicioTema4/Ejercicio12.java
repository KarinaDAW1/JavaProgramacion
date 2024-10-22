package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			System.out.println("Fins a quin valor vols sumar múltiples de 3?");
			int limit = 0;
			limit = sc.nextInt();
			sc.nextLine();
			int resultado = 0;
			int i;
			
			for(i=3; i<=limit; i=i+3) {
				
				resultado+=i;
			}
			System.out.println("La suma de multiples de 3 a "+limit+" es "+resultado);
		}
		
		
	}

}
