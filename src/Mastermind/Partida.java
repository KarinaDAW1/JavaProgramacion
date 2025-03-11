package Mastermind;

import java.util.Random;

public class Partida {
    private Random random = new Random();
    private String Nom_usuari;
    private char[] CombinacioSecreta;
    private char[] LetrasCombinacio = {'R', 'B', 'G', 'M', 'Y', 'C'};
    private int LongitudCombinacionSecreta = 4;
    private Tirada[] LlistaTirades = new Tirada[16];
    private int intents = 0;
    private int Puntuacio;
    private boolean Estat_final = false;

    public Partida(String nom_usuari) {
        this.setNom_usuari(nom_usuari);
        this.CombinacioSecreta = new char[LongitudCombinacionSecreta]; 
        this.Puntuacio = 0; 
        GeneradorCombinacionSecreta(); 
    }
    
    /* Generador de combinación de 4 digitos, si quisiera más o menos, sólamente
     * tendría que cambiar la variable de LongitudCombinacionSecreta.
     */
    public void GeneradorCombinacionSecreta() {
        for (int i = 0; i < LongitudCombinacionSecreta; i++) {
            int index = random.nextInt(LetrasCombinacio.length);
            CombinacioSecreta[i] = LetrasCombinacio[index];
        }
    }
    
    /* Comprovar Tirada. Primer comprobará que sigui correcte y si es correcte, será TRUE
     * si no es correcte, será FALSE pero si comprueba que está pero mal ordenadas te marcará.
     */
    public int[] Comprovar(Tirada t) {
        char[] combinacioTirada = t.getCombinacioTirada();
        int[] RespostaTirada = {0, 0};
        boolean[] posicioCorreta = new boolean[4];
        boolean[] usatEnCodi = new boolean[4];

        for (int i = 0; i < LongitudCombinacionSecreta; i++) {
            if (combinacioTirada[i] == CombinacioSecreta[i]) {
                RespostaTirada[0]++;
                posicioCorreta[i] = true;
                usatEnCodi[i] = true;
                Puntuacio = Puntuacio + 3; 
            }
        }

        for (int i = 0; i < LongitudCombinacionSecreta; i++) {
            if (!posicioCorreta[i]) {
                for (int j = 0; j < LongitudCombinacionSecreta; j++) {
                    if (!usatEnCodi[j] && combinacioTirada[i] == CombinacioSecreta[j]) {
                        RespostaTirada[1]++;
                        usatEnCodi[j] = true;
                        Puntuacio = Puntuacio + 1; 
                        break;
                    }
                }
            }
        }
        
        /* Si coincide directamente, estat final = true has guayat */
        t.setRespostaTirada(RespostaTirada);
        LlistaTirades[intents++] = t;
        if (RespostaTirada[0] == LongitudCombinacionSecreta) {
            Estat_final = true;
        }
        return RespostaTirada;
    }

    public boolean isEstat_final() {
        return Estat_final;
    }

    public char[] getCombinacioSecreta() {
        return CombinacioSecreta;
    }

    public int getPuntuacio() {
        return Puntuacio;
    }

    public int getIntents() {
        return intents;
    }

	public String getNom_usuari() {
		return Nom_usuari;
	}

	public void setNom_usuari(String nom_usuari) {
		Nom_usuari = nom_usuari;
	}
}


