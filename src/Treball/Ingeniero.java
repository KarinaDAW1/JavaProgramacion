package Treball;

public class Ingeniero extends Treballador {

    public Ingeniero(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Resuelve problemas técnicos y diseña soluciones.");
    }
    
    public String toString () {
    	return super.toString();
    }
}
