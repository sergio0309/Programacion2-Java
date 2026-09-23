package POO;

public class MainPerro {
    public static void main(String[] args) {
        Perro dog = new Perro();
        dog.color = "Blanco";
        dog.nombre = "Firu";
        dog.raza = "Chihuahua";
        dog.tamanio = 20;
        dog.edad = 5;
        dog.genero = "M";

        System.out.println("El perro es de color "+ dog.color + " y su nombre es " + dog.nombre);
        System.out.println("Es de raza "+dog.raza+" su tamaño es de "+dog.tamanio+" cm");
        System.out.println("Tiene "+dog.edad+" años y es de genero "+dog.genero);

        System.out.println("---------- Metodos----------");
        dog.comer();
        dog.saltar();
        dog.dormir();

    }
}
