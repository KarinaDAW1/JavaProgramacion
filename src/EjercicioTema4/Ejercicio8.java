package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		System.out.println("Que tabla de multiplicar quieres?");
		
		num = sc.nextInt();
		
		for(int i=10;i>0;i--) {
			System.out.println(num+" x "+i+" = "+num*i);
		}sc.close();
		

	}

}
