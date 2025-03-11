package FigurasGeometricas;

public class Cercle extends FiguraGeometrica {
 private int centreX;
 private int centreY;
 private double radi;

 public Cercle(int posicioX, int posicioY, int centreX, int centreY, double radi) {
     super(posicioX, posicioY);
     this.centreX = centreX;
     this.centreY = centreY;
     this.radi = radi;
 }

 @Override
 public double calculArea() {
     return Math.PI * radi * radi;
 }

 @Override
 public double calculPerimetre() {
     return 2 * Math.PI * radi;
 }
}

