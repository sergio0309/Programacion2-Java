package Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("evo", 70);
        Animal perro = new Perro("Firu",5,"Rotbiller");
        Animal cachorro = new Cachorro("toby", 1, "mestizo");

        animal.hacerSonido();
        perro.hacerSonido();
        cachorro.hacerSonido();
    }
}
