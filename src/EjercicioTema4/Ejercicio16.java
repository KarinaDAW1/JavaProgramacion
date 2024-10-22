package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			
	        System.out.print("Introduzca numero de filas: ");
	        int numerofilas = sc.nextInt();
	        sc.close();
	        
	        System.out.println();
	        
	        for(int alt = 1; alt <=numerofilas; alt++) {
	        	
	        	for(int blanco = 1; blanco <=numerofilas-alt; blanco++) {
	        		System.out.print(" "); //print para poner uno al lado.
	        	}
	        
	        for(int asterisco=1; asterisco<=(alt*2)-1;asterisco++) {
	        	System.out.print("*"); //print para poner uno al lado
	        }
	        System.out.println();
	     }
	}

}
