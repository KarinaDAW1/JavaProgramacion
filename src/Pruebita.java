import java.util.Random;

public class Pruebita {
    public static void main(String[] args) {
        Random random = new Random();
        char[] availableChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'}; // caracteres específicos
        int combinationLength = 4; // longitud de la combinación
        StringBuilder secretCombination = new StringBuilder();
        
        for (int i = 0; i < combinationLength; i++) {
            int index = random.nextInt(availableChars.length); // selecciona un índice aleatorio
            secretCombination.append(availableChars[index]);
        }
        
        System.out.println("Combinación secreta: " + secretCombination.toString());
    }
}
