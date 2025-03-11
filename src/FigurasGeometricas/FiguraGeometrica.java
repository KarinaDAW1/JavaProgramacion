package FigurasGeometricas;

public abstract class FiguraGeometrica {
    private double posicioX;
    private double posicioY;

    public FiguraGeometrica(double posicioX, double posicioY) {
        this.posicioX = posicioX;
        this.posicioY = posicioY;
    }

    public double getPosicioX() {
        return posicioX;
    }

    public double getPosicioY() {
        return posicioY;
    }

    // Mètodes abstractes
    public abstract double calculArea();
    public abstract double calculPerimetre();

    @Override
    public String toString() {
        return "PosicioX = " + posicioX + ", posicioY = " + posicioY + "\n";
    }
}
