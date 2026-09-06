package Vehiculo;

public abstract class VehiculoTerrestre {
    public float precioInicial;
    public float MontoDeprec;
    public float total;

    public void setPrecioInicial(float monto){this.precioInicial = monto;}
    public float getPrecioInicial(){return this.precioInicial;}
    public float getMontoDeprec() {
        return MontoDeprec;
    }
    public void setMontoDeprec(float montoDeprec) {
        MontoDeprec = montoDeprec;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    
    //Funciones abstractas
    public abstract float depreciacion();
}
