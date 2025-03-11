package Treball;

public class Administrador extends Treballador {

    public Administrador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Gestiona tareas administrativas y documentación.");
    }
    
    public String toString () {
    	return super.toString();
    }
}
