package EjercicioTema2;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t = true;
		boolean f = false;
		
		System.out.println("A       B      A||B");
		if(f == false) {
			System.out.println(f+" "+f+"   "+f);
			if(f != t) {
				System.out.println(f+" "+t+"    "+t);
				if(t != f) {
					System.out.println(t+"  "+f+"   "+t);
					if(t == true) {
						System.out.println(t+"  "+t+"    "+t);
					}
				}
			}
		}
		
	}

}
