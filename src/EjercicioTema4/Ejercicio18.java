package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero que no sea negativo:");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("El número debe ser positivo");
			sc.close();
			return;
		}
		
		System.out.println("Introduce la base:");
		int base = sc.nextInt();
		
		String r = "";
		int exponente = 0;
		
		while (num > 0) {
			int resto = num % base;
			num = num / base;
			
			r = resto + "* ("+base+"^"+exponente +")"+(r.isEmpty() ?"":" + ")+ r;
			exponente++;
		}
		System.out.println("El numero base es: "+base+" y su resultado es: "+r);
		
		sc.close();
		
	}

}