package TryCatchErrores;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatchProbandoErrores {
	
	static Scanner sc = new Scanner(System.in);
	static boolean salir = false;

	public static void main(String[] args) {
		
		
		while(!salir) {
			System.out.println("////////////////////////");
			System.out.println("MENU TRY CATCH EXCEPTION");
			System.out.println("////////////////////////");
			System.out.println("///// EJERCICIO 8.1 ////");
			System.out.println("1. Error Arithmetic");
			System.out.println("2. Error ArrayIndexOutOfBounds");
			System.out.println("3. Error Exception");
			System.out.println("4. Error InputMismatch");
			System.out.println("////// EJERCICIO 8.3 //////////");
			System.out.println("5. Error IOExc");
			System.out.println("6. Error NullPointer");
			System.out.println("///// EJERCICIO 8.4 //////");
			System.out.println("7. Interrupted Exception");
			System.out.println("8. Salir");
			int opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion) {
            
            case 1:
            	ArithmeticError();
            	break;
            	
            case 2:
            	ArrayIndexOutOfBounds();
            	break;
            	
            case 3:
            	Exception();
            	break;
            	
            case 4:
            	InputMismatchException();
            	break;
            	
            case 5:
            	IOExcepction();
            	break;
            
            case 6:
            	NullPointerException();
            	break;
            case 7:
            	IOExcepction();
            	break;
            case 8:
            	salir = true; 
            	default:
            	System.out.println("Vuelve a intentarlo.");
            	break;
            }
		}
	}

	private static void ArithmeticError() {
		try {
			int resultado = 25 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Error matematico :"+e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			System.out.println(e.getSuppressed());
			e.printStackTrace();
		}
		
	}
	
	private static void ArrayIndexOutOfBounds() {
		int [] arr = new int[5];
		try {
			arr[10] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Array :"+e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			System.out.println(e.getSuppressed());
			e.printStackTrace();
		}
		
	}
	
	private static void Exception() {
		System.out.println("Este es el padre. Engloba a todos.");
		try {
			int resultado = 25 / 0;
		} catch (Exception e) {
			System.out.println("Error matematico :"+e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			System.out.println(e.getSuppressed());
			e.printStackTrace();
		}
		
	}
	
	private static void InputMismatchException() {
		try {
			System.out.println("Escribe un numero entero:");
			int numero = sc.nextInt();
			System.out.println("Has escrito :" +numero);
		}catch (InputMismatchException e) {
			System.out.println("Error has escrito un valor no entero :"+e.getMessage());
		}
		
	}
	
	private static void IOExcepction() {
		File file = new File("algo.txt");
		
		try {
			FileReader f = new FileReader(file);
			int i;
		}catch(IOException e) {
			System.out.println("Fallo de E/S");
			e.getMessage();
			System.out.println(e.toString());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			System.out.println(e.getSuppressed());
			e.printStackTrace();
		}
	}
	
	private static void NullPointerException() {
		String t = null;
		
		try {
			 int longitud = t.length();
			 
		}catch (NullPointerException e) {
			System.out.println("Quisiste hacer un objeto null :"+e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			System.out.println(e.getSuppressed());
			e.printStackTrace();
		}
		
	}

}
