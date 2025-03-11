package FigurasGeometricas;

public class Quadrat extends FiguraGeometrica {
	 private int ample;
	 private int altura;

	 public Quadrat(int posicioX, int posicioY, int ample, int altura) {
	     super(posicioX, posicioY);
	     this.ample = ample;
	     this.altura = altura;
	 }

	 @Override
	 public double calculArea() {
	     return ample * altura;
	 }

	 @Override
	 public double calculPerimetre() {
	     return 2 * (ample + altura);
	 }
 }
