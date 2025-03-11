package Biblioteca;

public class ArmariLlibres {
    private Llibre[] Llibres = new Llibre[50];

    public ArmariLlibres() {
        this.Llibres = new Llibre[50];
    }

    public void InsertarLlibre(Llibre llibre) {
        for (int i = 0; i < Llibres.length; i++) {
            if (Llibres[i] == null) {
                Llibres[i] = llibre;
                System.out.println("Llibre insertat a la posición " + i);
                return;
            }
        }
        System.out.println("L'armari está lleno. No puedes insertar más");
    }

    public void EliminarLlibre(String titulo) {
        for (int i = 0; i < Llibres.length; i++) {
            if (Llibres[i] != null && Llibres[i].getTitulo().equalsIgnoreCase(titulo)) {
                for (int j = i; j < Llibres.length - 1; j++) {
                    Llibres[j] = Llibres[j + 1];
                }
                Llibres[Llibres.length - 1] = null;
                System.out.println("Llibre eliminat correctament.");
                return;
            }
        }
        System.out.println("Llibre no trobat.");
    }

    public void MostrarLlibres() {
        boolean llibresTrobats = false;
        for (int i = 0; i < Llibres.length; i++) {
            if (Llibres[i] != null) {
                System.out.println(Llibres[i]);
                llibresTrobats = true;
            }
        }
        if (!llibresTrobats) {
            System.out.println("No hi ha llibres a l'armari.");
        }
    }

	public void ModificarLlibre(String titulo, Llibre libroActualizado) {
		// TODO Auto-generated method stub
		
	}
}
