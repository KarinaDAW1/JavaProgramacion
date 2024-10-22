package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double preu;
		final double PREU_MINIM = 100;
		final double EXTRA = 2;
		
		System.out.println("Introduce el precio: ");
		preu = sc.nextDouble();
		
		if(preu > 0) {
			if(preu >= PREU_MINIM) {
				System.out.println("El preu final es: "+preu);
			}else if (preu <30) {
				preu = preu + EXTRA;
				System.out.println("El preu final se le ha sumado dos euros y es: "+preu);
			}else if (preu<100 && preu>30) {
				System.out.println("El preu final es: "+preu);
			}else{
				System.out.println("El precio tiene que estar entre 0 y 10");
			}sc.close();
			
		}

	}

}
