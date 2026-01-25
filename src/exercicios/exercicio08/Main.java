package exercicios.exercicio08;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int soma = 0; //acumulador
        for  (int i = 1; i <= n; i++) {
            soma= soma + i;
        }
        System.out.println("Soma:"+ soma);
    }
}
