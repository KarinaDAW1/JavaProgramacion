package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio14CercarDivisor {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			int numdivisor=0;
			boolean encontrado = false;
			System.out.println("Mete un número por pantalla mayor que 1:");
			if(sc.hasNextInt()==true) {
				numdivisor = sc.nextInt();
			}
			else {
				System.out.println("Has introducido un String, solamente acepta números enteros!");
			}
			
			if(numdivisor>1) {
				
				for(int i = numdivisor-1;i>1; i--) {
					if(numdivisor%i==0) {
						numdivisor = i;
						encontrado = true;
						break;
					}	
				}
				
			if(encontrado) {
				System.out.println("El divisor más grande es: "+numdivisor);
				
			}else {
				System.out.println("No se ha encontrado ningún divisor positivo más grande");
				}
			}
		}	
	}

}
