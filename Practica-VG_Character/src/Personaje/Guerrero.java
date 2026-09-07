package Personaje;

public class Guerrero extends Personaje{
    //Atributo
    private double buffDañoClase;
    private double armadura;
    double golpe;
    boolean atacado = true;
    //Para leer datos
    LeerDato lectura = new LeerDato();

    public void registrar(){
        System.out.print("Nombre del Guerrero: ");
        this.nombre = lectura.LeerConsoleScanner();
        System.out.print("Nivel del guerrero: ");
        this.nivel = Integer.parseInt(lectura.LeerConsoleScanner());
        System.out.print("Vida del guerrero: ");
        this.cant_vida = Double.parseDouble(lectura.LeerConsoleScanner());
        //BuffDaño
        this.buffDañoClase = 2;//200%
        System.out.print("Poder del guerrero: ");
        this.poder_ataque = Double.parseDouble(lectura.LeerConsoleScanner());
    }

    public double getArmadura() {
        return armadura;
    }
    public void setArmadura(double armadura) {
        this.armadura = armadura;
    }
    //Constructor
    public Guerrero(){this.buffDañoClase = 1.3;}
    public Guerrero(String nombre,int nivel,double vida,double poderataque){
        this.nombre = nombre;
        this.nivel = nivel;
        this.cant_vida = vida;
        this.buffDañoClase = 2;//200%
        this.poder_ataque = poderataque;
    }

    public void serAtacado(){
        if(atacado){
            this.cant_vida = this.cant_vida - (golpe/this.armadura);
        }
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Armadura "+this.armadura);
    }

    @Override
    public double poderAtaqueFinal(){
        return this.buffDañoClase*this.poder_ataque;
    }
}
