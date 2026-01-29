package Fase01JavaLogica.CheckPoints;

import java.util.Scanner;

public class CP02SintelaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double qtd = 0;
        double nota = 0;
        System.out.println("Digite as notas (ou -1 para encerrar):");
        while (true) {
            System.out.println("Nota: ");
            nota = sc.nextDouble();
            if (nota == -1) {
                break;
            }
            soma += nota;
            qtd++;

        }
        if (qtd > 0) {
            double media = soma / qtd;
            System.out.println("\n--- RESULTADO ---");
            System.out.println("Quantidade de notas: " + qtd);
            System.out.println("Soma total: " + soma);
            System.out.printf("Média final: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }
        sc.close();
    }
}
