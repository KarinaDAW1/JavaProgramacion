package EjercicioTema5_6;

import java.util.Scanner;


public class Institut{
	static int longitudalum;
	static int longitudprof;
	static Alumne [] Alumnos = new Alumne[longitudalum];
	static Professor [] Profesor = new Professor[longitudprof];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
				System.out.println("Cuantos alumnos tienes?");
				longitudalum = sc.nextInt();
				
				System.out.println("Cuantos profesores tienes?");
				longitudprof = sc.nextInt();
			
			
			Alumnos = new Alumne [longitudalum];
			Profesor = new Professor [longitudprof];
			
			System.out.println("--/* INTRODUCIENDO ALUMNOS */--\n");
			llenarAlumnos();
			System.out.println("--/* INTRODUCIENDO PROFESORES */--\n");
			llenarProfesor();
			System.out.println("--/* MOSTRAR INFORMACION ALUMNOS */--\n");
			mostrarInformacion(Alumnos);
			System.out.println("--/* MOSTRAR INFORMACION PROFESORES */--\n");
			mostrarInformacion(Profesor);
			
	}
	public static void llenarAlumnos() {
		Scanner sc = new Scanner (System.in);
			for(int i = 0; i < longitudalum ; i++) {
				System.out.println("Introduce el Nombre del Alumno");
				String nom = sc.nextLine();
				
				System.out.println("Introduce el DNI del Alumno");
				String dni = sc.nextLine();
				
				System.out.println("Introduce la Edad del Alumno");
				int edat = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Introduce el nivell (ESO, Batxillerat, FP Grau Mitjà o FP Grau Superior)");
				String nivell = sc.nextLine();
				
				Alumnos[i] = new Alumne (nom, dni, edat, nivell);	
				
			}
		}
	
	public static void llenarProfesor() {
		Scanner sc = new Scanner (System.in);
			for(int x = 0; x< longitudprof ; x++) {
				System.out.println("Introduce el nombre del Profesor");
				String nom = sc.nextLine();
				
				System.out.println("Introduce la dni del Profesor");
				String dni = sc.nextLine();
				
				System.out.println("Introduce la Edad del Profesor");
				int edat = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Introduce la asignatura que dona");
				String asignatura = sc.nextLine();
				
				Profesor[x] = new Professor (nom, dni, edat, asignatura);
			}
	}
	
	public static void mostrarInformacion(Personas[] Alumne) {
		for (Personas p: Alumne) {
			p.mostrarDades();
			System.out.println();
		}
	}
}


