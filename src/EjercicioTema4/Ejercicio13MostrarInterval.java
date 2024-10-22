package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio13MostrarInterval {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			System.out.println("Añade dos números enteros");
			int num1=0;
			int num2=0;
			if(sc.hasNextInt()==true) {
				num1 = sc.nextInt();
			}
			else {
				System.out.println("Has introducido un String, solamente acepta números enteros!");
			}
			if(sc.hasNextInt()==true) {
				num2 = sc.nextInt();
			}
			else {
				System.out.println("Has introducido un String, solamente acepta números enteros!");
			}
			
			if(num1<num2) {
				System.out.println("Los números entre "+num1+" y "+num2);
				for(num1 = num1+1; num1<num2;num1++) {
					System.out.println("- "+num1);
				}
			}else
			{
				System.out.println("Error! El primer número tiene que ser más pequeño que el segundo número.");
			}
		}
		
	}

}
