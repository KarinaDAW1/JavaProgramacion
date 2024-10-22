package EjercicioTema2;
import java.util.Scanner;

public class Ejercicio24 {
	
	private static Scanner lector;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		System.out.println("Escriu un caracter y et retornara el següent caracter \t");
		lector = new Scanner (System.in);
		a = lector.next().charAt(0);
		
		System.out.println("La primera lletra que has escrit es: "+a);
		int n = (char)a; // Convertimos de char a int
		System.out.println("El número en ASCII es: "+n); 
		n = n+1; // Le sumamos uno al valor ASCII
		System.out.println("La siguiente letra del abecedario es: "+(char)n);
		
	}

}
