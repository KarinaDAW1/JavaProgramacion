package FigurasGeometricas;

import java.util.Scanner;

public class GestioFigura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de figuras que tienes: ");
        int numFiguras = sc.nextInt();
        sc.nextLine();

        FiguraGeometrica[] figuras = new FiguraGeometrica[numFiguras];

        for (int i = 0; i < numFiguras; i++) {
            System.out.println("Introduce las coordenadas de la PosicioX:");
            int posicioX = sc.nextInt();
            System.out.println("Introduce las coordenadas de la PosicioY:");
            int posicioY = sc.nextInt();
            sc.nextLine();

            System.out.println("Selecciona el tipo de figura:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Rombo");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la anchura del rectángulo: ");
                    int ample = sc.nextInt();
                    System.out.println("Introduce la altura del rectángulo:");
                    int altura = sc.nextInt();
                    figuras[i] = new Rectangle(posicioX, posicioY, ample, altura);
                    break;
                case 2:
                    System.out.println("Introduce el lado del cuadrado:");
                    int ample1 = sc.nextInt();
                    System.out.println("Introduce el lado del cuadrado:");
                    int altura1 = sc.nextInt();
                    figuras[i] = new Quadrat(posicioX, posicioY, ample1, altura1);
                    break;
                case 3:
                    System.out.println("Introduce el radio del círculo:");
                    double radi = sc.nextDouble();
                    figuras[i] = new Cercle(posicioX, posicioY, posicioX, posicioY, radi);
                    break;
                case 4:
                    System.out.println("Introduce la diagonal mayor del rombo:");
                    double diagonalMajor = sc.nextDouble();
                    System.out.println("Introduce la diagonal menor del rombo:");
                    double diagonalMenor = sc.nextDouble();
                    figuras[i] = new Rombe(posicioX, posicioY, diagonalMajor, diagonalMenor);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    i--;
                    break;
            }
        }

        for (FiguraGeometrica figura : figuras) {
            System.out.println("Tipo de figura: " + figura.getClass().getSimpleName());
            System.out.println("Área: " + figura.calculArea());
            System.out.println("Perímetro: " + figura.calculPerimetre());
        }

        sc.close();
    }
}


