package Vehiculo;
public class App {
    public static void main(String[] args) throws Exception {
        AutoPart au1 = new AutoPart(2312);
        System.out.println(au1.precioInicial);
        System.out.println(au1.getpctDepreciacion());
        System.out.println(au1.depreciacion());
    }
}
