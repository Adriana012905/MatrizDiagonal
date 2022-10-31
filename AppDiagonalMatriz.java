
package Vista;

import Negocio.OrdenarDiagonalMatriz;
import java.util.Scanner;

public class AppDiagonalMatriz {

    public static void main(String[] args) {
        OrdenarDiagonalMatriz dm = new OrdenarDiagonalMatriz();
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique la cantidad de filas de la matriz");
        int filas = sc.nextInt();

        System.out.println("Indique la cantidad de columnas de la matriz");
        int columnas = sc.nextInt();

        int[][] M = new int[filas][columnas];

        System.out.println("Digite los elementos de la matriz");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz con diagonal ordenada:\n" +  toString(dm.diagonalSort(M)));
    }

    public static String toString(int[][] M) {
        String msg = "";
        for (int vector[] : M) {
            for (int elemento : vector) {
                msg += elemento + "\t";
            }
            msg += "\n";
        }
        return msg;
    }
}
