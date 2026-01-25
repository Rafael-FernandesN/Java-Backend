package exercicios.exercicio09;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int pares = 0;
        int impares = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                pares ++;

            } else
                impares ++;
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}


