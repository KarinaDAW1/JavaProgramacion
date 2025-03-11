package ExamenKarina;

import java.util.Scanner;

import Hotel.Reserva;

public class GestionObrasArte {
	
	static boolean salir = false;
	static ObraArte[] GestionObrasArte = new ObraArte[50];
	static int contador = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 while (!salir) {
	            System.out.println("\nMENU DE GESTION DE OBRAS DE ARTE");
	            System.out.println("1. Agregar obra de arte.");
	            System.out.println("2. Mostrar todas las obras de arte.");
	            System.out.println("3. Mostrar solo las pinturas");
	            System.out.println("4. Mostrar solo las esculturas");
	            System.out.println("5. Mostrar solo las fotografías");
	            System.out.println("6. Exhibir una obra");
	            System.out.println("7. Vender una pintura");
	            System.out.println("8. Restaurar una fotografía");
	            System.out.println("9. Salir");
	            System.out.print("Selecciona una opción: ");
	            int opcion = sc.nextInt();
	            sc.nextLine();

	            switch(opcion) {
	            
	            case 1:
	            		AgregarObraArte();
	            	break;
	            	
	            case 2:
	            		MostrarTodo();
	            	break;
	            	
	            case 3:
	            		MostrarSoloPintura();
	            	break;
	            	
	            case 4:
	            		MostrarSoloEscultura();
	            	break;
	            	
	            case 5:
	            		MostrarSoloFotografia();
	            	break;
	            	
	            case 6:
	            		ExhibirObras();
	            	break;
	            	
	            case 7:
	            		VenderUnaPintura();
	            	break;
	            	
	            case 8:
	            		RestaurarFotografia();
	            	break;
	            
	            case 9:
	            		
	            	break;
	            	
	            	default:
	            
	            }
	        }

	

	}
	
	private static void AgregarObraArte() {
		 if (contador >= GestionObrasArte.length) {
	            System.out.println("No se pueden agregar más Obras de Arte");
	            return;
	        }
		 
		 System.out.println("Que tipo de Obra de Arte quieres implementar?");
		 System.out.println("1. Pintura");
		 System.out.println("2. Escultura");
		 System.out.println("3. Fotografia");
		 int opcionObra = sc.nextInt();
		 sc.nextLine();
		 
		 if (opcionObra == 1) {
			 
			 System.out.println("--- HAS ELEGIDO PINTURA ---");
			 System.out.print("Introduce el titulo de la Obra de Arte: ");
			 String titulo = sc.nextLine();
			 sc.nextLine();
			 System.out.println("Introduce el autor de la Obra de Arte: ");
			 String autor = sc.nextLine();
			 sc.nextLine();
			 System.out.println("Introduce el año de creación de la Obra de arte: ");
			 String creacion = sc.nextLine();
			 sc.nextLine();
			 System.out.println("Introduce la técnica de uso.");
			 String tecnica = sc.nextLine();
			 sc.nextLine();
			 
			 Pintura pintura = new Pintura(titulo, autor, creacion, tecnica);
			 GestionObrasArte[contador++] = new ObraArte(titulo, autor, creacion, tecnica);
			 
			 
		 } else if (opcionObra == 2) {
			 System.out.println("--- HAS ELEGIDO ESCULTURA ---");
			 System.out.print("Introduce el titulo de la Obra de Arte: ");
			 String titulo = sc.nextLine();
			 System.out.println("Introduce el autor de la Obra de Arte: ");
			 String autor = sc.nextLine();
			 System.out.println("Introduce el año de creación de la Obra de arte: ");
			 String creacion = sc.nextLine();
			 System.out.println("Introduce el material");
			 String material = sc.nextLine();
			 sc.nextLine();
			 
			 Escultura escultura = new Escultura(titulo, autor, creacion, material);
			 GestionObrasArte[contador++] = new ObraArte(titulo, autor, creacion, material);
			 
			 
		 } else if (opcionObra == 3) {
			 System.out.println("--- HAS ELEGIDO FOTOGRAFIA ---");
			 System.out.print("Introduce el titulo de la Obra de Arte: ");
			 String titulo = sc.nextLine();
			 System.out.println("Introduce el autor de la Obra de Arte: ");
			 String autor = sc.nextLine();
			 System.out.println("Introduce el año de creación de la Obra de arte: ");
			 String creacion = sc.nextLine();
			 System.out.println("Introduce el tipo de");
			 String tipo = sc.nextLine();
			 sc.nextLine();
			 
			 Fotografia fotografia = new Fotografia(titulo, autor, creacion, tipo);
			 GestionObrasArte[contador++] = new ObraArte(titulo, autor, creacion, tipo);;
		 }
	}
	
	private static void MostrarTodo() {
		if (contador == 0) {
            System.out.println("No hay Obras de Arte.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            System.out.println("\n"+GestionObrasArte[i]);
            
        }
    }

	
	private static void MostrarSoloPintura() {
		System.out.println("Mostrar solo Pintura:");
		for (int i = 0; i < contador; i++) {
            if (GestionObrasArte[i] instanceof Pintura) {
               System.out.println("\n"+GestionObrasArte[i]);
            }
        }
		
	}

	private static void MostrarSoloEscultura() {
		for (int i = 0; i < contador; i++) {
            if (GestionObrasArte[i] instanceof Fotografia) {
               System.out.println("\n"+GestionObrasArte[i]);
            }
        }
	}

	private static void MostrarSoloFotografia() {
			for (int i = 0; i < contador; i++) {
	            if (GestionObrasArte[i] instanceof Fotografia) {
	            	System.out.println();
	               System.out.println("\n"+GestionObrasArte[i]);
	            }
	        }
		}




	private static void ExhibirObras() {
		System.out.print("Introduce el nombre de la Obra de Arte que quieres: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < contador; i++) {
            if (GestionObrasArte[i].getTitulo().equalsIgnoreCase(nombre)) {
                System.out.println("\n"+GestionObrasArte[i]);
                return;
            }
        }
        System.out.println("Nombre de Obra de Arte no encontrado.");
		
	}




	private static void VenderUnaPintura() {
		System.out.print("Introduce el nombre de la Pintura de Arte que quieres vender: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < contador; i++) {
            if (GestionObrasArte[i].getTitulo().equalsIgnoreCase(nombre)) {
                System.out.println("\n"+GestionObrasArte[i]);
                return;
            }
        }
        System.out.println("Nombre de Obra de Arte no encontrado.");
		
	}




	private static void RestaurarFotografia() {
		System.out.print("Introduce el nombre de la Fotografia que quieres restaurar: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < contador; i++) {
            if (GestionObrasArte[i].getTitulo().equalsIgnoreCase(nombre)) {
                System.out.println("\n"+GestionObrasArte[i]);
                return;
            }
        }
        System.out.println("Nombre de Obra de Arte no encontrado.");
		
	}

}
