package Vehiculo;

public class Bicicleta extends VehiculoTerrestre{
    
    private float pctDep = 0.05f;

    public Bicicleta(){}
    public Bicicleta(float precio_auto){
        this.precioInicial = precio_auto;
    }
    public void setpctDepreciacion(float porcentaje){
        this.pctDep = porcentaje;
    }
    public float getpctDepreciacion(){
        return this.pctDep;
    }

    public float calcularPrecio(){
        this.MontoDeprec = (float)(precioInicial*pctDep);
        total = precioInicial - MontoDeprec;
        return total;
    }

    @Override
    public float depreciacion(){
        MontoDeprec = precioInicial * pctDep;
        return MontoDeprec;
    }   
}
