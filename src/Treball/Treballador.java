package Treball;

public class Treballador {
    private String nombre;
    private double salario;

    public Treballador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void cobrar() {
        System.out.println(nombre+ " ha cobrado el salario de "+salario+"euros.");
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    
    public void trabajar() {
        System.out.println("Aquest treballador realitza tasques generals.");
    }
    
    public String toString () {
    	return toString();
    } 
}

