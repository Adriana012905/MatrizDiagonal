
package casosdeprueba;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CasosDePrueba {

    static String pruebas = "";
    static Matriz m;
    
    public static void main(String[] args) {
        File archivo;
        FileWriter texto;
        BufferedWriter bw;
        PrintWriter pw;
        
        int n = 1;
        while (n <= 50) {
            m = new Matriz(true);
            pruebas += "Caso " + n + ":" + "\n" + m.toString() + "\n\n";
            n++;
        }
        
        while (n <= 100) {
            m = new Matriz(false);
            pruebas += "Caso " + n + ":" + "\n" + m.toString() + "\n\n";
            n++;
        }
        

        try{
            archivo = new File("Pruebas.txt");
            texto = new FileWriter(archivo);
            bw  = new BufferedWriter(texto);
            pw = new PrintWriter(bw);
            
            pw.write(pruebas);
            pw.close();
            bw.close();

        }catch(Exception e){
                System.err.println("No fue posible crear el archivo");
        }
        
    }
    
}
