package EjercicioTema2;
import java.util.Scanner;

public class Ejercicio22 {

	private static Scanner lector;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		
		System.out.println("Escriu una frase y la trauré per pantalla en majúscules: \t");
		lector = new Scanner (System.in);
		frase = lector.nextLine();
		
		System.out.println("La frase en majúscules es:\t");
		System.out.println(frase.toUpperCase());
		

	}

}
