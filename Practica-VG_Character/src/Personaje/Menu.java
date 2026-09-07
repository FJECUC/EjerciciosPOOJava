package Personaje;

public class Menu {
    
    public void menuInicio(){
        System.out.println("PERSONAJES");
        System.out.println("[1]. Registrar");
        System.out.println("[2]. Mostrar datos");
        System.out.println("[3]. Cantidad de Daño");
        System.out.println("[4]. salir");
    }
    public void MostrarDatos(Personaje personaje){
        personaje.mostrarDatos();
        this.pausa();
    }

    public void menuRegistro(){
        System.out.println("REGISTRO");
        System.out.println("[1]. Guerrero");
        System.out.println("[2]. Mago");
        System.out.println("[3]. Arquero");
        System.out.println("[4]. Salir");
    }

    public void menuSalida(){
        System.out.println("Gracias por utilizar la aplicacion :D");
    }
    public void pausa(){
        LeerDato lectura = new LeerDato();
        System.out.println("Presione enter para continuar...");
        lectura.LeerConsoleScanner();
    }
}
