package EjercicioTema4;

import java.util.Scanner;

public class EjemploSwitchCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			double num1=0, num2=0;
			int opcion=0;
			
			System.out.println("-- MENU CALCULADORA --");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("Introduce dos números:");
			
			if(sc.hasNextDouble()==true) {
				num1 = sc.nextDouble();
			}
			else {
				System.out.println("Tipo de dato introducido incorrecto");
			}
			
			if(sc.hasNextDouble()==true) {
				num2 = sc.nextDouble();
			}
			else {
				System.out.println("Tipo de dato introducido incorrecto");
			}
			
			System.out.println("Introduce la opcion: 1-4");
			
			opcion=sc.nextInt();
			
			switch(opcion) {
			
			case 1 :
				System.out.println("La suma es: "+(num1+num2));
				break;
			
			case 2 :
				System.out.println("La resta es: "+(num1-num2));
				break;
				
			case 3 :
				System.out.println("La multiplicacion es: "+(num1*num2));
				break;
				
			case 4 :
				System.out.println("La división es: "+(num1/num2));
				break;
				
			default :
				System.out.println("Opcion incorrecta, tienes que poner un número entre el 1 y el 4");	
			
			}
		}
		

	}

}
