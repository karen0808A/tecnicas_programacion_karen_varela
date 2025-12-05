class Persona {
    private String nombre;
    private int edad;
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad >= 0) this.edad = edad;
    }
}
public class EncapsulacionEjemplo {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Karen");
        p.setEdad(20);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
    }
}