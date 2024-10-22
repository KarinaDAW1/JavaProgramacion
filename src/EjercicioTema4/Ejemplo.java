package EjercicioTema4;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dades = {1,2,3,4,5,6,7,8,9,10};
		
		// No saldrán los números que haya dentro del if
		
		for (int i = 0 ; i <dades.length; i++)  { 
			if(dades[i] == 7) {
				continue;
			}
			System.out.println(dades[i]+" ");
		}
		System.out.println("Has salido del bucle!");
	}

}
