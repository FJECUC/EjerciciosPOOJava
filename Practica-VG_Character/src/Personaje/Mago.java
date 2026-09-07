package Personaje;

public class Mago extends Personaje{
    private double buffDañoClase;
    private double cant_mana;
    private int curar = 70;

    public double getCant_mana() {
        return cant_mana;
    }

    public void setCant_mana(double cant_mana) {
        this.cant_mana = cant_mana;
    }

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

    public Mago(){this.buffDañoClase = 1.3;}
    public Mago(String nombre,int nivel,double vida,double poderataque){
        this.nombre = nombre;
        this.nivel = nivel;
        this.cant_vida = vida;
        this.buffDañoClase = 2;//200%
        this.poder_ataque = poderataque;
    }

    public void hechizoCurar(){
        if(this.cant_mana>=this.curar){System.out.println("Utilizaste curación!");}
        else{System.out.println("Mana insuficiente!");}
    }


    @Override
    public double poderAtaqueFinal(){
        return this.buffDañoClase*this.poder_ataque;
    }
}
