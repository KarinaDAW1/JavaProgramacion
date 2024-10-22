package EjercicioTema2;
import java.util.Scanner;

public class EjerciciPracticTema3 {

	private static Scanner lector;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String [][] inventari = new String [3][3];
		//int quantitat = Integer.ParseInt(inventari[0][1]) Este para pasar el String a int
		//double preu = Double.ParseDouble(Inventari[0][2]) Este para pasar el String a Double
		// usamos el lector.next
		
		String Inventario [][] = new String [3][3];
		
		System.out.println("Introduce la información para el producto 1:");
		lector = new Scanner (System.in);
		Inventario[0][0] = lector.next();
		Inventario[0][1] = lector.next();
		Inventario[0][2] = lector.next();
		
		System.out.println("Nom del producte: "+Inventario[0][0]);
		int cantidad = Integer.parseInt(Inventario[0][1]);
		System.out.println("Cantidad de estoc: "+cantidad);
		double precio = Double.parseDouble(Inventario[0][2]);
		System.out.println("Precio por unidad: "+precio+"\n");
		
		System.out.println("Introduce la información para el producto 2:");
		lector = new Scanner (System.in);
		Inventario[1][0] = lector.next();
		Inventario[1][1] = lector.next();
		Inventario[1][2] = lector.next();
		
		System.out.println("Nom del producte: "+Inventario[1][0]);
		int cantidad1 = Integer.parseInt(Inventario[1][1]);
		System.out.println("Cantidad de estoc: "+cantidad1);
		double precio1 = Double.parseDouble(Inventario[1][2]);
		System.out.println("Precio por unidad: "+precio1+"\n");
		
		System.out.println("Introduce la información para el producto 3:");
		lector = new Scanner (System.in);
		Inventario[2][0] = lector.next();
		Inventario[2][1] = lector.next();
		Inventario[2][2] = lector.next();
		
		System.out.println("Nom del producte: "+Inventario[2][0]);
		int cantidad2 = Integer.parseInt(Inventario[2][1]);
		System.out.println("Cantidad de estoc: "+cantidad2);
		double precio2 = Double.parseDouble(Inventario[2][2]);
		System.out.println("Precio por unidad: "+precio2+"\t \n");
		
		System.out.println("Inventario de la tienda:");
		System.out.println("Nombre   Cantidad Precio/Unidad  Total");
		
		System.out.println(Inventario[0][0]+"\t "+Inventario[0][1]+"\t  "+Inventario[0][2]+"\t \t "+cantidad*precio);
		System.out.println(Inventario[1][0]+"\t "+Inventario[1][1]+"\t  "+Inventario[1][2]+"\t \t "+cantidad1*precio1);
		System.out.println(Inventario[2][0]+" "+Inventario[2][1]+"\t  "+Inventario[2][2]+"\t \t "+cantidad2*precio2+"\n");
		
		double total = cantidad*precio + cantidad1*precio1 + cantidad2*precio2;
		System.out.println("Valor total del inventario: "+total);
		
	}

}
