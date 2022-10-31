package casosdeprueba;

import java.util.Random;

public class Matriz {

    int M[][];
    
    public Matriz() {
    }

    public Matriz(boolean cuadrada) {
        if(cuadrada){
            int n = new Random().nextInt(6) + 2 ; 
            M = new int[n][n];
        }
        else{
           M = new int[new Random().nextInt(6) + 2 ][new Random().nextInt(6) + 2]; 
        }
        crearMatriz();
    }

    private void crearMatriz() {
        if (this.M == null) {
            throw new RuntimeException("Matriz sin memoria");
        }
        for (int i = 0; i < this.M.length; i++) {
            crearElementos(this.M[i]);
        }
    }

    private void crearElementos(int[] vectorFilasxCol) {
        for (int j = 0; j < vectorFilasxCol.length; j++) {
            vectorFilasxCol[j] = new Random().nextInt(200);
        }
    }

    public String toString() {
        String msg = "";
        for (int vector[] : this.M) {
            for (int elemento : vector) {
                msg += elemento + "\t";
            }
            msg += "\n";
        }
        return msg;
    }

    public int[][] getM() {
        return M;
    }

    public void setM(int[][] M) {
        this.M = M;
    }

}
