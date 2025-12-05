class PersonaBase {
    String nombre;
    int edad;
    void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
class Estudiante extends PersonaBase {
    String carrera;
    void estudiar() {
        System.out.println(nombre + " está estudiando " + carrera);
    }
}
public class HerenciaEjemplo {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Karen";
        e.edad = 20;
        e.carrera = "Tecnología de la Información";
        e.presentarse();
        e.estudiar();
    }
}