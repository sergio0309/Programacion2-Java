package Animal;

public class Cachorro extends Perro{
    public Cachorro(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }
    public void hacerSonido(){
        System.out.println(getNombre() + " dice: CARACORA!!");
    }
}
