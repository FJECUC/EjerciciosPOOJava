package Vehiculo;
public class AutoPart extends Automovil{
    AutoPart(){}
    AutoPart(float precio_inicial){
        this.setpctDepreciacion(0.3f);
        this.precioInicial = precio_inicial;
    }

    public float depreciacion(){
        return precioInicial*getpctDepreciacion();
    }
}