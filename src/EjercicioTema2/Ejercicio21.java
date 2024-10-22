package EjercicioTema2;
import java.util.Scanner;

public class Ejercicio21 {

	private static Scanner lector;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fah;
		
		System.out.println("Escriu els graus Fahrenheits: ");
		lector = new Scanner (System.in);
		fah = lector.nextDouble();
		
		double calculo = (fah - 32) * 5/9;
		
		System.out.println("La conversión dels graus Fahrenheit que has ficat a graus Celsius es: "+calculo+"ºC");
		
		
		
	}

}
