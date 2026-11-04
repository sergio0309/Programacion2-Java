package Practica_Banco;

public class CuentaBancaria {
    private String titulaCuenta;
    private double balance;
    public CuentaBancaria(String titulaCuenta, double balance) {
        this.titulaCuenta = titulaCuenta;
        this.balance = balance;
    }
    public void depositar(double monto){
        if( monto > 0){
            balance += monto; //balance = balance + monto;
            System.out.println("Deposito exitoso");
        } else {
            System.out.println("Monto ingresado invalido");
        }
    }
    public void retirar(double monto){
        if(monto > 0 && monto <= balance){
            balance -= monto;
            System.out.println("Retirado exitoso");
        }else  {
            System.out.println("Monto ingresado invalido");
        }
    }
    public void mostrarSaldo(){
        System.out.println("Saldo: "+ balance);
    }
}