package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Escribe cuantos numeros primos quieres");
			int num = sc.nextInt();
			
			if(num<=0) {
				System.out.println("Solo numeros mayores a 0 o positivos.");
				sc.close();
				return;
			}
			
			int[] primos = new int[num];
			int numprim = 2;
			int contador = 0;
			
			while(contador < num) {
				if(esprimo(numprim)) {
					primos[contador] = numprim;
					contador++;
				}
				numprim++;
			}
			
			System.out.println("Los primeros "+contador+" numeros primeros son: ");
			for(int i = 0; i <primos.length;i++) {
				System.out.print(primos[i]+(i< primos.length -1? ", ":""));
			}
		}

	}

	private static boolean esprimo(int numprim) {
		// TODO Auto-generated method stub
		if(numprim <2) return false;
		for(int i = 2; i * i <= numprim; i++) {
			if(numprim % i == 0) {
				return false;
			}
		}
		return true;
	}

}
