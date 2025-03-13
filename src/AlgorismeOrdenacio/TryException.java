package AlgorismeOrdenacio;

// Classe de la nova Excepció
class TryException extends Exception {
    private String Mensaje;
    private int Error;

    // Constructor amb els paràmetres
    public TryException(String mensaje, int Error) {
        super(mensaje);
        this.Mensaje = mensaje;
        this.Error = Error;
    }

    // Métodes "getter"
    public String getMensaje() {
        return Mensaje; // Retorna el missatge
    }

    public int getError() {
        return Error; // Retorna el codi d'error
    }

    // Sobrescrivint el mètode toString
    @Override
    public String toString() {
        return "NovaExcepcio: " + Mensaje + " (Codi d'error: " + Error + ")";
    }
}

