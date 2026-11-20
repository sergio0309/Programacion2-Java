package Animal;

public class Cachorro extends Perro{
    public Cachorro(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: CATACORA!!");
    }
}
