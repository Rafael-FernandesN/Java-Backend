package exercicios.exercicio06;

public class Main {
    public static void main(String[] args) {

        int saldo = 100;
        int valorCompra = 30;

        if (saldo >= valorCompra) {
            int saldoFinal = saldo - valorCompra;
            System.out.println("Compra aprovada");
            System.out.println("Saldo final: " + saldoFinal);
        } else {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual: " + saldo);
        }
    }
}
