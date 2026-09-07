package Personaje;
public class App {
    public static void main(String[] args) throws Exception {
        LeerDato lectura = new LeerDato();
        Menu menu = new Menu();

        Guerrero Link = new Guerrero();
        Mago Lucas = new Mago();
        //Personajes
        /*Guerrero Link = new Guerrero();

        Mago Lucas = new Mago(
            "Lucas", 
            200, 
            15000, 
            20);
            */
            
        Arquero Legolas = new Arquero(
            "Legolas",
            100,
            5000,
            30);

        Aplicacion:
        while(true){
            menu.menuInicio();
            int opt_menu = Integer.parseInt(lectura.LeerConsoleScanner());
            if (opt_menu<=4 || opt_menu>=1){

                switch (opt_menu){
                    case 1://Registrar
                        MenuRegistro:
                        while(true){
                            menu.menuRegistro();
                            int opt_menu_registro = Integer.parseInt(lectura.LeerConsoleScanner());
                            if(opt_menu_registro<=4 || opt_menu_registro>=1){
                                switch (opt_menu_registro) {
                                    case 1:
                                        Link.registrar();
                                        break;
                                    case 2:
                                        Lucas.registrar();
                                        break;
                                    case 3:
                                        break;
                                    case 4:break MenuRegistro;
                                }
                            }
                        }
                        //Link.registrar();
                        System.out.println("Registrado con exito");
                        menu.pausa();
                        break;
                    case 2://Mostrar datos
                        //menu.MostrarDatos(Legolas);
                        menu.MostrarDatos(Link);
                        break;
                    case 3://Calculo de daño
                        break;
                    case 4://Salir
                        menu.menuSalida();
                        break Aplicacion;
                }
            }
        }
        System.out.println("");
    }
}