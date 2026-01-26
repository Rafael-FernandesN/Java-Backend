package fases.fase1.exercicios;

public class E09ContaParesImpares {
    public static void main(String[] args) {
        int n = 5;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
