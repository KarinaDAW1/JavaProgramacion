package Treball;

public class Director extends Treballador {

    public Director(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Supervisa los equipos y toma decisiones estratégicas.");
    }
    
    public String toString () {
    	return super.toString();
    }
}
