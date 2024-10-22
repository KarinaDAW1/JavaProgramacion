package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			int valorUsuari = 0;
			
			do {
				System.out.println("Introduce un valor entre 0 i 12");
				
				valorUsuari = sc.nextInt();
				
			}while((valorUsuari <0)||(valorUsuari > 12));
			
			System.out.println("Dato correcto. Has escrito. "+valorUsuari);
		}

	}

}
