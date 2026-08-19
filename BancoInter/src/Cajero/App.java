package Cajero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void printMenu(){
        System.out.println("=== CAJERO ===");
    }
    public static void main(String[] args){
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido");
        do{
            printMenu();
            int opt_menu = Integer.parseInt(buffer.readLine());
            switch (opt_menu) {
                case value:
                    
                    break;
            
                default:
                    break;
            }
        }while(true);
    }
}
