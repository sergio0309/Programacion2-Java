package Practica_Banco;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria("Ever Cruz", 1000.90);
        AppBancaria app = new AppBancaria(cuentaBancaria);
        app.comenzar();
    }
}
