package Personaje;
/* 
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.Scanner;

public class LeerDato {
    
    /* 
    public String LeerconsolaBuffer(){
        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
        return dato.readLine();
    }
    */
   Scanner lectura = new Scanner(System.in);
   public String LeerConsoleScanner(){
    String dato = lectura.nextLine();
    return dato;
   }
}
