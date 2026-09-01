package Cajero;

import java.io.*;

public class App {

	public static void printMenuInicial(){
		System.out.println("==== CAJERO ====");
		System.out.println("[1]. Deposito");
		System.out.println("[2]. Retiro");
		System.out.println("[3]. Saldo");
		System.out.println("[4]. Salir");
	}
	public static void main(String[] args) throws IOException{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		
		int opt_menu = 0;
		float cant_Almacenada = 0;
		
		System.out.println("Bienvenido");
		AplicacionCajero: //Etiquetar el bucle
		do{
			//MENU INICIAL
			printMenuInicial();
			//VERIFICACION DE LA OPCION INTRODUCIDA
			while (true) {
				System.out.print("Escriba la operacion a realizar: ");
				opt_menu = Integer.parseInt(buffer.readLine());
				if(0<opt_menu && opt_menu<5){
					break;
				}else{
					System.out.println("ERROR. Escriba una opcion valida");
				}
			}
			//DESARROLLO DE OPCIONES
			switch (opt_menu) {
				case 1:
					while(true){
						System.out.print("Escriba la cantidad a depositar: ");
						float dep = Float.parseFloat(buffer.readLine());
						if (dep<=0){
							System.out.println("ERROR. Ingrese un monto valido.");
						}else{
							cant_Almacenada = cant_Almacenada + dep;
							break;
						}
					}
					break;
				case 2:
					while(true){
						System.out.print("Ingrese la cantidad a retirar: ");
						float ret = Float.parseFloat(buffer.readLine());
						if (ret<=0){
								System.out.println("ERROR. Ingrese un monto valido.");
						}else{
							if(ret>cant_Almacenada){
								System.out.println("ERROR. Saldo insuficiente");
							}else{
								cant_Almacenada = cant_Almacenada - ret;
								break;
							}
						}
					}
					break;
				case 3:
					System.out.println("==============================================");
					System.out.println("Tiene un saldo disponible de " + cant_Almacenada);
					System.out.println("==============================================");
					break;
				case 4:
					System.out.println("Gracias por usar el Cajero");
					break AplicacionCajero; //Gracias a la etiqueta decimos que rompa el bucle, no solo el switch
			}
		}while(true);
	}
}
