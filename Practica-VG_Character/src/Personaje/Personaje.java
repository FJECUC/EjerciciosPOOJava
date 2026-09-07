package Personaje;
public abstract class Personaje{//abstract
    String nombre;
    int nivel;
    double cant_vida;
    double poder_ataque;
    double poder_base;
    int dinero = 0;

    public void mostrarDatos(){
        System.out.println(this.nombre);
        System.out.println(this.nivel);
        System.out.println(this.cant_vida);
        System.out.println(this.poderAtaqueFinal());
    }

    public abstract double poderAtaqueFinal();
}