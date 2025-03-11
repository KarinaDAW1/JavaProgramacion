package Musica;

public class GestioMusica {
    public static void main(String[] args) {

        Mp3 m = new Mp3(6.0);
        m.reproduir();
        System.out.println("Durada Mp3: " + m.getDurada() + " en minutos");
        
        Ogg o = new Ogg(5.0);
        o.reproduir();
        System.out.println("Durada Ogg: " + o.getDurada() + " en minutos");
    }
}
