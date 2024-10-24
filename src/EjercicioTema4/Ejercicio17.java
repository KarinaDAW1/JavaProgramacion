package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			
			int num=0;
			System.out.println("Escribe un número entero.");
			if(sc.hasNextInt()==true) {
				num = sc.nextInt();
			}
			else {
				System.out.println("Has introducido un String, solamente acepta números enteros!");
			}
			String binario = "";
			if(num == 0) {
				binario = "0";
			}else {
				while(num > 0) {
					binario = (num%2)+binario;
					num /=2;
				}
			}
			System.out.println("El numero binario es: "+binario);
			
		}
		
	}

}
