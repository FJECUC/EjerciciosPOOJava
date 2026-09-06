package Vehiculo;

public class Tren extends VehiculoTerrestre{
            
    private float pctDep = 0.45f;

    public Tren(){}
    public Tren(float precio_auto){
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
