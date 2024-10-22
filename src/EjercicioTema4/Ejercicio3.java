package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Que nota has sacado?");
		float nota = lector.nextFloat();
		
		System.out.println("La nota es: ");
		if(nota >= 0 && nota <= 10) { //Comprobación que el valor está entre 0 y 10
			
			if((nota >= 9) && (nota<=10)) {
				System.out.println("Excelente! "+nota);
			}else if(nota <9 && nota >=6.5) {
				System.out.println("Notable "+nota);
			}else if (nota < 6.5 && nota >= 5) {
				System.out.println("Suficiente "+nota);
			}else {
				System.out.println("Has suspendido. "+nota);
			}
		}lector.close();
	}

}
