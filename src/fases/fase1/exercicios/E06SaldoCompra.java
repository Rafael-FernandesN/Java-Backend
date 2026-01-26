package fases.fase1.exercicios;

public class E06SaldoCompra {
    public static void main(String[] args) {
        double saldo = 100.00;
        double VCompra = 100.00;
        double NSaldo = ( saldo - VCompra );
        if (saldo >= VCompra) {
            System.out.println("Compra realizada com sucesso");
            System.out.println("Saldo Atual:  "+NSaldo);
        }else  {
            System.out.println("Saldo insuficiente");
        }
    }
}
