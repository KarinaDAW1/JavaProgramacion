package JocReina;

public class JocReina {
	    int totalQueens = 8;
	    int[] tablero = new int[totalQueens];

	    public static void main(String[] args) {
	        new JocReina().check(0);
	    }

	    private void check(int n) {
	        if (n == totalQueens) {
	            PintarTablero();
	            return;
	        }
	        for (int i = 0; i < totalQueens; i++) {
	            tablero[n] = i;  
	            if (judge(n)) {
	                check(n + 1);
	            }
	        }
	    }

	    private boolean judge(int n) {
	        for (int i = 0; i < n; i++) {
	        	// Aqui esta el problema. Math.abs lo hicimos en clase. Sólo consegui hacer tablero[i] == tablero[n]
	            if (tablero[i] == tablero[n] || Math.abs(n-i) == Math.abs(tablero[n]-tablero[i])) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private void PintarTablero() {
	        for (int i = 0; i < totalQueens; i++) {
	            for (int j = 0; j < totalQueens; j++) {
	                if (tablero[i] == j) {
	                    System.out.print("O");
	                } else {
	                    System.out.print("*");
	                }
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	}
