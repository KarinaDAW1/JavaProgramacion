package EjercicioTema2;
import java.util.Scanner;

public class Ejercicio23 {
	
	private static Scanner lector;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena;
		char c;
		
		System.out.println("Escriu una frase y trauré la derrera lletra \t");
		lector = new Scanner (System.in);
		cadena = lector.nextLine();
		
		c = cadena.charAt(cadena.length()-1);
		System.out.println(c);
		

	}

}
