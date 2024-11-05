package EjercicioTema4;

import java.util.Scanner;

public class MostrarLlista {
	
	private static int [] llistaEnters = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llegirLlista();
		ordenarLlista();
		mostrarLlista();
		
		}

	public static void mostrarLlista() {
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

	public static void llegirLlista() {
		// TODO Auto-generated method stub
		System.out.println("L'array ordenat es: [ ");
		for(int i = 0; i < llistaEnters.length;i++) {
			System.out.println(llistaEnters[i]+" ");
		}
		System.err.println("]");
		
	}

}
