package exercicios.exercicio11;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 17;

        int maior = a; // suposição inicial

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.println("Maior: " + maior);
    }
}
