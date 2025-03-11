package Treball;

public class Comercial extends Treballador {

    public Comercial(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Atiende clientes y genera ventas.");
    }
    
    public String toString () {
    	return super.toString();
    }
}
