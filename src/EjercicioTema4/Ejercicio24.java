package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio24 {

	static double euros = 0;
	static double resultado = 0;
	static String moneda;
	static double lliures = 0.85;
	static double dolares = 1.16;
	static double iens = 131.66;
	
	public static void main(String[] args) {
		
			llegirEuros();
			llegirMoneda();
			conversor();
	}
	
	public static void llegirEuros() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Escriu un valor en cantidad de euros");
			euros = sc.nextDouble();
		}
	}
	
	public static void llegirMoneda() {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Escriu a quina moneda vols cambiar el valor escrit.");
			System.out.println("* Lliures");
			System.out.println("* Dolars");
			System.out.println("* Iens");
			moneda = sc.next();
		}
		
	}
	
	public static void conversor() {
		
		switch(moneda){
			case "Lliures":
				resultado = euros * lliures;
				moneda = "Lliures";
				System.out.println(+euros+"€ en Lliures es: "+resultado);
				break;
				
			case "Dolars":
				resultado = euros * dolares;
				moneda = "Dolars";
				System.out.println(+euros+"€ en Dolars es: "+resultado);
				break;
				
			case "Iens":
				resultado = euros * iens;
				moneda = "Iens";
				System.out.println(+euros+"€ en Iens es: "+resultado);
				break;
		}
		
	}

}
