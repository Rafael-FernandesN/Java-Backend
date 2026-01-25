package exercicios.exercicio10;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int maior = 1;
        int menor = 1;
        for (int i = 1; i <= n; i++) {
            {
                if (i > maior) {
                    maior = i;
                    if (i < menor)
                        i = menor;

                }
            }
            System.out.println("Maior: " + maior
                    + " Menor: " + menor);
        }
    }
}