package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean divisible = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero y veremos si es divisible por el mismo y por 1");
		int num = sc.nextInt();
		
		if (num < 2) {
			System.out.println(num+" no es un numero divisible");
			sc.close();
			return;
		}
		
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				divisible = false;
				break;
			}
		}
		
		if(divisible) {
			System.out.println("Es un numero divisible. "+num);
		}else {
			System.out.println("No es un numero divisible. "+num);
		}sc.close();
		
	}

}
