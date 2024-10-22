package EjercicioTema2;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multiplicacion
		
		int taula = 5;
		int resultado = 0;
		int multiplicador = 0;
		
		System.out.println("Tabla de multiplicar del numero: "+taula);
		
		while (multiplicador <= 10) {
			
			resultado = taula * multiplicador;
			System.out.println(taula+" x "+multiplicador+" = "+resultado);
			multiplicador = multiplicador + 1;
			
			if(multiplicador > 10) {
				System.out.println("//////////////////");
			}
			
		}
			
	}

}
