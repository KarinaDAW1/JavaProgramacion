package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] billetes = {500, 200, 100, 50, 20, 10, 5};
		int [] cantidad = new int[billetes.length];
		System.out.print("Introduce una cantidad de euros. (Tiene que ser multiple de 5€)");
		int euros = sc.nextInt();
		
		if(euros % 5 != 0) {
			System.out.println("Este número no es multiple de 5, introduce otro número.");
				
		}
		
		for(int i = 0; i < billetes.length;i++) {
			if (euros >= billetes[i]) {
				cantidad[i] = euros / billetes[i];
				euros = euros % billetes[i];
			}
		}
		
		for(int j = 0; j < billetes.length;j++) {
			if (cantidad[j] > 0) {
				System.out.println(cantidad[j]+" billetes de: "+billetes[j]+"€");
			}
		}
		
	}

}
