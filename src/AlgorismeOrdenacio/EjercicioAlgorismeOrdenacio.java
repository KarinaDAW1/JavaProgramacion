package AlgorismeOrdenacio;

import java.util.Scanner;

public class EjercicioAlgorismeOrdenacio {

    static Scanner sc = new Scanner(System.in);
    static int Llista;
    static int[] LlistaDesordenada;
    static int[] LlistaOrdenada;
    static boolean salir = false;
    static int contador;

    public static void main(String[] args) {

        System.out.println("///////////////////////");
        System.out.println("/////JOC ORDENACIÓ/////");
        System.out.println("///////////////////////");

        while (!salir) {

            System.out.println("\nMENÚ JOC ORDENACIÓ");
            System.out.println("1. Ordenació per inserció directa.");
            System.out.println("2. Ordenació bombolla");
            System.out.println("3. Ordenació de selecció directa.");
            System.out.println("4. Ordenació per intercanvi directa.");
            System.out.println("5. Salir.");
            int opcion = sc.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("ORDENACIÓ PER INSERCIÓ DIRECTA.");
                System.out.println("Escriu quants números vols ordenar.");
                Llista = sc.nextInt();
                LlistaDesordenada = new int[Llista];
                LlistaOrdenada = new int[Llista];
                System.out.println("Escriu els números:");
                for (int i = 0; i < Llista; i++) {
                    LlistaDesordenada[i] = sc.nextInt();
                }
                OrdenacioInsercioDirecta(LlistaDesordenada);
                break;

            case 2:
                System.out.println("ORDENACIÓ BOMBOLLA");
                System.out.println("Escriu quants números vols ordenar.");
                Llista = sc.nextInt();
                LlistaDesordenada = new int[Llista];
                LlistaOrdenada = new int[Llista];
                System.out.println("Escriu els números:");
                for (int i = 0; i < Llista; i++) {
                    LlistaDesordenada[i] = sc.nextInt();
                }
                OrdenacioBombolla();
                
                break;

            case 3:
            	 System.out.println("ORDENACIÓ SELECCIÓ DIRECTA");
                 System.out.println("Escriu quants números vols ordenar.");
                 Llista = sc.nextInt();
                 LlistaDesordenada = new int[Llista];
                 LlistaOrdenada = new int[Llista];
                 System.out.println("Escriu els números:");
                 for (int i = 0; i < Llista; i++) {
                     LlistaDesordenada[i] = sc.nextInt();
                 }
                 OrdenacioSeleccioDirecta();
                break;

            case 4:
            	 System.out.println("ORDENACIÓ INTERCANVI DIRECTA");
                 System.out.println("Escriu quants números vols ordenar.");
                 Llista = sc.nextInt();
                 LlistaDesordenada = new int[Llista];
                 LlistaOrdenada = new int[Llista];
                 System.out.println("Escriu els números:");
                 for (int i = 0; i < Llista; i++) {
                     LlistaDesordenada[i] = sc.nextInt();
                 }
                 OrdenacioIntercanviDirecta();
                break;

            case 5:
                salir = true;
                break;

            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void OrdenacioInsercioDirecta (final int[] LlistaDesordenada) {
        int n = LlistaDesordenada.length;
        int[] LlistaOrdenada = new int[n];

        for (int i = 0; i < n; i++) {
            LlistaOrdenada[i] = LlistaDesordenada[i];
        }
        for (int i = 1; i < n; i++) {
            int contador = LlistaOrdenada[i];
            int j = i - 1;
            while (j >= 0 && LlistaOrdenada[j] > contador) {
                LlistaOrdenada[j + 1] = LlistaOrdenada[j];
                j = j - 1;
            }
            LlistaOrdenada[j + 1] = contador;
        }
        System.out.println("Llista ordenada per inserció directa:");
        for (int i = 0; i < n; i++) {
            System.out.print(LlistaOrdenada[i]+" ");
        }
    }

	
	private static void OrdenacioBombolla() {
			int n = LlistaDesordenada.length;
			
			for(int i = 0; i < n - 1; i++) {
				for(int j = 0; j < n ; j++) {
					
					if(LlistaDesordenada[i] > LlistaDesordenada[j - 1]) {
						int Llista = LlistaDesordenada[i];
						LlistaDesordenada[i] = LlistaDesordenada[j];
						LlistaDesordenada[j] = Llista;
						
					}
				}
			}
			for(int i = 0; i < n; i++) {
				System.out.println(+LlistaDesordenada[n]+" ");
			}
			
	}
	 
	private static void OrdenacioSeleccioDirecta() {
	    int n = LlistaDesordenada.length;

	    for (int i = 0; i < n - 1; i++) {
	        int minIdx = i; 
	        for (int j = i + 1; j < n; j++) {
	            if (LlistaDesordenada[j] < LlistaDesordenada[minIdx]) {
	                minIdx = j;
	            }
	        }
	        int temp = LlistaDesordenada[minIdx];
	        LlistaDesordenada[minIdx] = LlistaDesordenada[i];
	        LlistaDesordenada[i] = temp;
	    }

	    System.out.println("Llista ordenada per selecció directa:");
	    for (int i = 0; i < n; i++) {
	        System.out.print(LlistaDesordenada[i] + " ");
	    }
	}

	private static void OrdenacioIntercanviDirecta() {
	    int n = LlistaDesordenada.length;

	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (LlistaDesordenada[i] > LlistaDesordenada[j]) {
	                int temp = LlistaDesordenada[i];
	                LlistaDesordenada[i] = LlistaDesordenada[j];
	                LlistaDesordenada[j] = temp;
	            }
	        }
	    }

	    System.out.println("Llista ordenada per intercanvi directa:");
	    for (int i = 0; i < n; i++) {
	        System.out.print(LlistaDesordenada[i] + " ");
	    }
	}

}


