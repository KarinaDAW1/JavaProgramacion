package ExamenAnterior;

public abstract class Electrodomestico {
    private String marca;
    private double precio;
    private double consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(String marca, double precio, double consumoEnergetico) {
        this.marca = marca;
        this.precio = precio;
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Precio: " + precio + ", Consumo Energético: " + consumoEnergetico;
    }
}
