package Practica_Banco;

import java.util.Scanner;

public class AppBancaria {
    private CuentaBancaria cuentaBancaria;
    private Scanner scanner;
    public AppBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        this.scanner = new Scanner(System.in);
    }
    public void comenzar(){
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesoOpcines(opcion);
        }while (opcion !=4);
    }
    public void mostrarMenu(){
        System.out.println("Selecciona una opcion:");
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Mostrar saldo");
        System.out.println("4. Salir");
    }
    private void gestionarDeposito(){
        System.out.println("Ingrese el mondo a depositar:");
        double depositoMonto = scanner.nextDouble();
        cuentaBancaria.depositar(depositoMonto);
    }
    private void gestionarExtraccion(){
        System.out.println("Ingrese el mondo a retirar:");
        double extraerMonto = scanner.nextDouble();
        cuentaBancaria.retirar(extraerMonto);
    }
    public void procesoOpcines(int opcion){
        switch (opcion){
            case 1: gestionarDeposito(); break;
            case 2: gestionarExtraccion(); break;
            case 3: cuentaBancaria.mostrarSaldo(); break;
            case 4:
                System.out.println("Programa finalizado");
            default:
                System.out.println("Opcion invalida"); break;
        }
    }
}
