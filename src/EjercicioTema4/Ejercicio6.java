
package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			double preu=0;
			final double PREU_MINIM = 80;
			final double DESCOMPTE = 10;
			
			System.out.println("Introduce el precio: "); //Comprueba que sea un número y no un String
			if(sc.hasNextDouble()==true) {
				preu = sc.nextDouble();
			}
			else {
				System.out.println("Has introducido un String, solamente acepta números!");
			}
			
			if(preu > 0) { /* Comparación que el precio sea mayor a 0 */
				if(preu > PREU_MINIM) {
					preu = preu - preu*DESCOMPTE/100; //Esto aplica un 10% de descuento.
				}
				System.out.println("El valor del preu final es: "+preu);
			}else {
				System.out.println("El precio tiene que ser positivo");
			}sc.close();
		}
	}
