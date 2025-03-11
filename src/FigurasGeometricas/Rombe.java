package FigurasGeometricas;

public class Rombe extends FiguraGeometrica {
 private double diagonalMajor;
 private double diagonalMenor;

 public Rombe(int posicioX, int posicioY, double diagonalMajor, double diagonalMenor) {
     super(posicioX, posicioY);
     this.diagonalMajor = diagonalMajor;
     this.diagonalMenor = diagonalMenor;
 }

 @Override
 public double calculArea() {
     return (diagonalMajor * diagonalMenor) / 2;
 }

 @Override
 public double calculPerimetre() {
	 
     double costat = Math.sqrt((diagonalMajor / 2) * (diagonalMajor / 2) + (diagonalMenor / 2) * (diagonalMenor / 2));
     return costat * 4;
 }
}
