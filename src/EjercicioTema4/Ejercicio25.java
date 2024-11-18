package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un número con longitud 15 entero.");
		
		String numero = sc.nextLine();
		
		char numAlto = numero.charAt(0);
		char numBajo = numero.charAt(0);
		int posAlto = 0;
	    int posBajo = 0;
		
		
		if (numero.length() != 15) {
			System.out.println("No es un número de longitud 15!");
		} else{
			for (int i = 1; i < numero.length();i++) {
					char num = numero.charAt(i);
				if(num > numAlto) {
					numAlto = num;
					posAlto = i;
				}
				
				if (num < numBajo) {
					numBajo = num;
					posBajo = i;
				}
			}
			System.out.println("La cifra más alta es: "+numAlto+" y su posición es: "+(posAlto+1));
			System.out.println("La cifra más baja es: "+numBajo+" y su posición es: "+(posBajo+1));
		}
	}

}
