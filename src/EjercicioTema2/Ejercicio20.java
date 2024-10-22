package EjercicioTema2;
import java.util.Scanner;

public class Ejercicio20 {

	private static Scanner lector;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = new int[3];
		
		System.out.println("Escriu el primer número: ");
		lector = new Scanner (System.in);
		Array[0] = lector.nextInt();
		System.out.println("Escriu el segon número: ");
		lector = new Scanner (System.in);
		Array[1] = lector.nextInt();
		System.out.println("Escriu el tercer número: ");
		lector = new Scanner (System.in);
		Array[2] = lector.nextInt();
		
		int multiArray = Array[0]*Array[1]*Array[2];
		
		System.out.println("La multiplicació dels 3 números que has escrit son: "+multiArray);
	}

}
