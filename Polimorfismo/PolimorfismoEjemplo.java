class Animal {
    void sonido() {
        System.out.println("El animal hace un sonido.");
    }
}
class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("El perro ladra: ¡Guau!");
    }
}
class Gato extends Animal {
    @Override
    void sonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }
}
public class PolimorfismoEjemplo {
    public static void main(String[] args) {
        Animal a;
        a = new Perro();
        a.sonido();
        a = new Gato();
        a.sonido();
    }
}