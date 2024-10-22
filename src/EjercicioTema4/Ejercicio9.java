package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		System.out.println("Cual es el dividendo?");
		int dividendo = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Cual es el divisor?");
		int divisor = sc.nextInt();
		sc.nextLine();
		
		while (dividendo >= divisor) {
			dividendo = dividendo - divisor;
			int cociente = dividendo / divisor;
			System.out.println("El dividendo vale: "+dividendo);
			System.out.println("El cociente de la división es: "+cociente);
			contador++;
		}sc.close();
		System.out.println("Se ha podido restar el divisor: "+contador);
	}

}
