abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    abstract void encender();
    void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    @Override
    void encender() {
        System.out.println("El auto se está encendiendo...");
    }
}
public class AbstraccionEjemplo {
    public static void main(String[] args) {
        Auto a = new Auto("Toyota", "Corolla");
        a.mostrarInfo();
        a.encender();
    }
}