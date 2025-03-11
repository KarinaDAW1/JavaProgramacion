package ExamenAnterior;

public class Nevera extends Electrodomestico implements EnReparacion {
    private double capacidad;

    public Nevera() {
    }

    public Nevera(String marca, double precio, double consumoEnergetico, double capacidad) {
        super(marca, precio, consumoEnergetico);
        this.capacidad = capacidad;
    }

    @Override
    public double reparar(int horas) {
        return PRECIO_HORA * horas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad: " + capacidad;
    }
}
