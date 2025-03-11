package ExamenAnterior;

public class Lavadora extends Electrodomestico implements EnReparacion {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(String marca, double precio, double consumoEnergetico, int carga) {
        super(marca, precio, consumoEnergetico);
        this.carga = carga;
    }

    @Override
    public double reparar(int horas) {
        return PRECIO_HORA * horas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga: " + carga;
    }
}

