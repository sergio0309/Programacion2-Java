package Metodo_Static.Bloque_Estatico;

public class ConfiguracionDB {
    static final String URL;
    static final String USER;
    static {
        URL = "jdbc:mysql://localhost:3306/Ejercicios";
        USER = "Juan Gabriel";
    }
    public static void main(String[] args) {
        System.out.println("Iniciando configuracion DB");
        System.out.println("URL: " + URL);
        System.out.println("USER: " + USER);
    }
}
