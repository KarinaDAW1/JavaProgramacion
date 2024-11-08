package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio22 {
	
	private static int [] llistaEnters = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
		inferiorsLlista();
		
		}

	public static void llegirLlista() {
		try (Scanner lector = new Scanner(System.in)) {
			System.out.println("Escriu 10 valors enters i prem retorn.");
			int index = 0;
			while (index < llistaEnters.length) {
				if(lector.hasNextInt()) {
					llistaEnters[index] = lector.nextInt();
					index++;
				} else {
					lector.next();
				}
			}
		}
		
	}

	public static void ordenarLlista() {
		// TODO Auto-generated method stub
		for( int i = 0; i < llistaEnters.length -1; i++) {
			for(int j = i +1; j < llistaEnters.length;j++) {
				if (llistaEnters[i] > llistaEnters[j]) {
					int canvi = llistaEnters[i];
					llistaEnters[i] = llistaEnters[j];
					llistaEnters[j] = canvi;
				}
			}
		}
		
	}

	public static void mostrarLlista() {
		// TODO Auto-generated method stub
		System.out.print("L'array ordenat es: [ ");
		for(int i = 0; i < llistaEnters.length;i++) {
			System.out.print(llistaEnters[i]+" ");
		}
		System.out.print("] \n");
		
	}
	
	public static void inferiorsLlista() {
		int maximo = llistaEnters[llistaEnters.length-1];
		int contador = 0;
		int mitad = maximo / 2;
		
		System.out.println("El número más grande es:"+maximo);
		System.out.println("Los números más pequeños que "+mitad+" son: ");
		
		for (int i = 0; i < llistaEnters.length; i++) {
			if(llistaEnters[i] < mitad) {
				System.out.print(llistaEnters[i]+" ");
				contador++;
			}
		}
		System.out.println("\n");
		System.out.println("Total de "+mitad+" son : "+contador);
	}
}
	
	
		

