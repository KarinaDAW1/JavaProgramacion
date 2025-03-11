package Cua;

import java.util.Scanner;


public class GestioCua { 
	
	static boolean salir = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Solo tengo que cambiar la medida de la cua.
        Personas[] Cua = new Personas[10];
		
        while (!salir) {
        	System.out.println("Cua Menu");
        	System.out.println("0. Añadir Personas a la Cua");
        	System.out.println("1. Eliminar Personas de la Cua");
        	System.out.println("2. Mostrar la cua actual");
        	System.out.println("> = 3.Salir");
        	int opcion = scanner.nextInt();
        	scanner.nextLine();
        	
        	switch(opcion) {
        	
        	case 0:
        		System.out.println("¿Cuantas personas quieres introducir a la cua?");
        		int qnty = scanner.nextInt();
        		for(int x = 0; x < Cua.length; x++) {
        			if (Cua[x] == null) {
        				for(int i = 0; i < qnty ; i++) {
        				System.out.println("Introduce el nombre de la Persona: ");
        				String nom = scanner.nextLine();
        				scanner.nextLine();
        				System.out.println("Introduce el DNI de la Persona: ");
        				String dni = scanner.nextLine();
        				scanner.nextLine();
        				
        				Cua[i] = new Personas (nom, dni); 
        				}
        				
        			}
        			else if(Cua[x] != null) {
        				System.out.println("La cua está llena, no puedes introducir más personas a la Cua.");
        			}
    			}
        		
        		break;
        	
        	case 1:
        		System.out.println("Eliminando a la primera Persona de la Cua.");
        		for(int x = 0; x < Cua.length; x++) {
        		   for(int j = 1; j < Cua.length; j++) {
        			   Cua[x] = Cua[j];
        		   }	
        		}
        		Cua[10] = null; 
        		
        		break;
        		
        	case 2:
        		System.out.println("Mostrar la cua actual: ");
        		
        		for(Personas p: Cua) {
        			p.toString();
        			System.out.println();
        		}
        		
        		break;
        		
        	case 3:
        		  System.out.println("Saliendo del programa");
                  salir = true;
                  break;
              default:
                  salir = true;
                  break;
        	}
        }
        
	}

}
