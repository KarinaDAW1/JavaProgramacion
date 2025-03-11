package Hotel;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaInicio;
    private String fechaFinal;

    public Reserva(Cliente cliente, Habitacion habitacion, String fechaInicio, String fechaFinal) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    @Override
    public String toString() {
        return "Reserva [Cliente=" + cliente + ", Habitacion=" + habitacion + ", Fecha de inicio=" + fechaInicio + ", Fecha de fin=" + fechaFinal + "]";
    }
}
