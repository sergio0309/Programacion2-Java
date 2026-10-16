package Metodo_String;

public class Metodos {
    public static void main(String[] args) {
        String texto = "Hola, Mundo!";
        // Metodo length
        System.out.println("Longitud: "+texto.length());
        //Metodo charAt
        System.out.println("Caracter: "+texto.charAt(3));
        //Metodo substring
        System.out.println("SubString: "+texto.substring(3,7));
        //Metodo toUpperCase y toLowerCase
        System.out.println("Mayuscula: "+texto.toUpperCase());
        System.out.println("Minuscula: "+texto.toLowerCase());
        String texto1 = "Hola";
        String texto2 = "hola";
        //Metodo equal
        System.out.println("¿Son iguales? " + texto1.equals(texto2));//False
        //Metodo equalIgnoreCase
        System.out.println("¿Son iguales?(ignora May-min) " + texto1.equalsIgnoreCase(texto2));
        //Metodo replace
        System.out.println("Reemplazando: "+texto.replace("o","a"));
        //Metodo trim()
        String texto3 = "    !Hola Mundo!     ";
        System.out.println("Antes: "+ texto3);
        System.out.println("Diferente: "+texto3.trim());
        //Metodo Split
        String csTexto = "Uno, Dos, Tres";
        String[] parts = csTexto.split(",");
        //String[] parts2 = {"Uno", "Dos", "Tres"};
        System.out.println("Dividido");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
