package FigurasGeometricas;

public class Rectangle extends FiguraGeometrica {
 private int ample;
 private int altura;

 public Rectangle(int posicioX, int posicioY, int ample, int altura) {
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
