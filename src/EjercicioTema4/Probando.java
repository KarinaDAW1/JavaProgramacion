package EjercicioTema4;

import java.util.Scanner;

public class Probando {

	    public static void main(String[] args) {
	        // Creem un objecte Scanner per llegir l'entrada de l'usuari
	        Scanner scanner = new Scanner(System.in);
	        
	        // Sol·licitem a l'usuari que introdueixi el text
	        System.out.print("Introdueix un text: ");
	        String text = scanner.nextLine();
	        
	        // Convertim tot el text a minúscules per fer una comparació insensible a majúscules/minúscules
	        text = text.toLowerCase();
	        
	        // Definim un array per comptar les aparicions de cada lletra (26 lletres de l'alfabet)
	        int[] comptadors = new int[26]; // Comptadors per cada lletra de l'alfabet
	        
	        // Recorrem cada caràcter del text
	        for (int i = 0; i < text.length(); i++) {
	            char car = text.charAt(i);
	            
	            // Comprovem si el caràcter és una lletra
	            if (car >= 'a' && car <= 'z') {
	                // Incrementem el comptador de la lletra corresponent
	                comptadors[car - 'a']++;
	            }
	        }
	        
	        // Inicialitzem variables per trobar la lletra més comuna
	        char lletraMesComuna = ' ';
	        int maxComptatge = 0;
	        
	        // Busquem la lletra amb el màxim nombre d'aparicions
	        for (int i = 0; i < 26; i++) {
	            if (comptadors[i] > maxComptatge) {
	                maxComptatge = comptadors[i];
	                lletraMesComuna = (char) (i + 'a');
	            }
	        }
	        
	        // Mostrem el resultat
	        System.out.println("La lletra que més surt és '" + lletraMesComuna + "' i apareix " + maxComptatge + " vegades.");
	        
	        // Tanquem el scanner
	        scanner.close();
	    }
	}
