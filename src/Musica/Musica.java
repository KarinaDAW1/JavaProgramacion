package Musica;

public abstract class Musica {
    private double durada;

    public Musica(double durada) {
        this.durada = durada;
    }

    public double getDurada() {
        return durada;
    }

    public abstract void reproduir();
}
