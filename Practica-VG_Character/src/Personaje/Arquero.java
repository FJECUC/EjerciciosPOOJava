package Personaje;

public class Arquero extends Personaje{//Herencia
    //Atributos unicos de Arquero
    private double buffDañoClase;
    private int cant_fechas = 0;
    
    public int getCant_fechas() {
        return cant_fechas;
    }
    public void setCant_fechas(int cant_fechas) {
        this.cant_fechas = cant_fechas;
    }
    //Construcctor
    public Arquero(){this.buffDañoClase = 1.3;}
    public Arquero(String nombre,int nivel,double vida,double poderataque){
        this.nombre = nombre;
        this.nivel = nivel;
        this.cant_vida = vida;
        this.buffDañoClase = 1.3;
        this.poder_ataque = poderataque;
    }
    public void dispararFlecha(){
        if(this.cant_fechas==0){
            System.out.println("No tienes flechas!!");
        }else{
            this.cant_fechas = this.cant_fechas-1;
        }
    }
    //Polimorfismo
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(this.cant_fechas);
    }

    @Override
    public double poderAtaqueFinal(){
        return this.buffDañoClase*this.poder_ataque;
    }

}
