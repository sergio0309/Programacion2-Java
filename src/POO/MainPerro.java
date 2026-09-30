package POO;

public class MainPerro {
    public static void main(String[] args) {
        Perro dog = new Perro("Firu",5,"M");

        System.out.println("El perro su nombre es " + dog.nombre);
        System.out.println("Tiene "+dog.edad+" años y es de genero "+dog.genero);

        /*System.out.println("---------- Metodos ----------");
        dog.comer();
        dog.saltar();
        dog.dormir();
        */
        System.out.println("---------- Perro 2 ----------");
        Perro dog1 = new Perro();
        System.out.println("El nombre es "+ dog1.nombre);
        System.out.println("Edad: "+dog1.edad);
        System.out.println("Genero: "+dog1.genero);

        System.out.println("---------- Perro 3 ----------");
        Perro dog2 = new Perro("Chacalitos");
        System.out.println("El nombre es "+ dog2.nombre);
        System.out.println("Edad: "+dog2.edad);
        System.out.println("Genero: "+dog2.genero);

        System.out.println("---------- Perro 4 ----------");
        Perro dog3 = new Perro("Juancho", 10);
        System.out.println("El nombre es "+ dog3.nombre);
        System.out.println("Edad: "+dog3.edad);
        System.out.println("Genero: "+dog3.genero);

    }
}
