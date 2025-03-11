package Mastermind;

public class Tirada {
    private char[] combinacioTirada; 
    private int[] respostaTirada;  
    
    public Tirada(char[] combinacioTirada) {
        this.combinacioTirada = combinacioTirada;
        this.respostaTirada = new int[2]; 
    }

    public char[] getCombinacioTirada() {
        return combinacioTirada;
    }

    public void setCombinacioTirada(char[] combinacioTirada) {
        this.combinacioTirada = combinacioTirada;
    }

    public int[] getRespostaTirada() {
        return respostaTirada;
    }

    public void setRespostaTirada(int[] respostaTirada) {
        this.respostaTirada = respostaTirada;
    }
}
