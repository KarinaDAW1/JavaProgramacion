package Musica;

public class Mp3 extends Musica {
    public Mp3(double durada) {
        super(durada);
    }

    @Override
    public void reproduir() {
        System.out.println("Reproduint mp3");
    }
}
