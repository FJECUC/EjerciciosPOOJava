package Vehiculo;

public abstract class VehiculoTerrestre {
    private double precio;

    public void setPrecio(double monto){
        this.precio = monto;
    }
    public double getPrecio(){return this.precio;}

    public abstract void depreciacion();
}
