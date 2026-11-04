package Relacion_Clases;

public class Persona {
    public void CalcularSuma(Calculadora calculadora){
        int resultado = calculadora.add(1, 2);
        System.out.println("Resultado: "+resultado);
    }
}
