package EjercicioTema4;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] resto = new int [100];
		int num;
		int base;
		int indice = 0;
		
		System.out.println("**/*Transformador/** - Conversor de un número entero a cualquier base.");
		System.out.println("Escribe un numero entero.");
		num = sc.nextInt();
		System.out.println("Escribe la base a transformar el número");
		base = sc.nextInt();
		if(num <= 0) {
			System.out.println("El número tiene que ser positivo o más grande que 0.");
			sc.close();
			return;
		}else if (num >base) {
			
			while(num > 0) {
				resto[indice++] = num % base;
				num = num / base;
				
		
			}
			for(int i = indice; i >= 0; i--) {
				System.out.print(resto[i]+"* ("+base+"^"+i+") + ");
			}
		}
		
		System.out.println("El numero base es: "+base+" y el número elegido es: "+num);
		
	}

}
