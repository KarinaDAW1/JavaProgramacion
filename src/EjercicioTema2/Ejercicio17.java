package EjercicioTema2;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayA[] = {5,3,6,2,1,4};
		int arrayB [] = {7,6,1,8,4,3};
		int SumaC [] = new int [5];
		
		for (int i = 0 ; i < 5 ; i ++) {
			SumaC[i] = arrayA[i] + arrayB[i];
			System.out.println("La suma de los números de las posiciones  "+ i + " = "+SumaC[i]);
		}
		

	}

}
