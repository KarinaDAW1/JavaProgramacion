package Figura;

public class GestioFigura {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
        r.dibuixar();
        
        Cercle c = new Cercle();
        c.dibuixar();
        
        Figura f1 = new Rectangle();
        Figura f2 = new Cercle();
        f1.dibuixar();
        f2.dibuixar();
    }
}