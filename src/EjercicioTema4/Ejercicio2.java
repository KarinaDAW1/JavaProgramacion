package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int NOMBRE_SECRET1 = 5;
		final int NOMBRE_SECRET2 = 10;
		int numUsuari1, numUsuari2;
		
		System.out.println("Tienes que introducir dos números del 1 al 10. Si aciertas uno de los números secretos, ganas.");
		numUsuari1 = sc.nextInt();
		numUsuari2 = sc.nextInt();
		
		if(numUsuari1 == NOMBRE_SECRET1 && numUsuari2 == NOMBRE_SECRET2) {
			System.out.println("Has adivinado los dos números secretos! Has ganado!! "+numUsuari1+"  "+numUsuari2);
			
		}else if (numUsuari1 == NOMBRE_SECRET1 && numUsuari2 != NOMBRE_SECRET2) {
			System.out.println("Has adivinado uno de los números secretos. Has ganado!! "+numUsuari1);
			
		}else if (numUsuari1 != NOMBRE_SECRET1 && numUsuari2 == NOMBRE_SECRET2) {
			System.out.println("Has adivinado uno de los números secretos. Has ganado!! "+numUsuari2);
		}else {
			System.out.println("No has adivinado ninguno de los números secretos. Has perdido!");
		}sc.close();
	}

}
