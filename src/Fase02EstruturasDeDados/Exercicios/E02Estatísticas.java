package Fase02EstruturasDeDados.Exercicios;

import java.util.Scanner;

public class E02Estatísticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdValidos = 0;
        long soma = 0;

        Integer maior = null;
        Integer menor = null;

        int qtdPares = 0;
        int qtdImpares = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break; // 0 encerra e não entra

            // ignora fora do intervalo
            if (n < -1000 || n > 1000) continue;

            // agora é válido
            qtdValidos++;
            soma += n;

            if (maior == null || n > maior) maior = n;
            if (menor == null || n < menor) menor = n;

            if (n % 2 == 0) qtdPares++;
            else qtdImpares++;
        }

        System.out.println("quantidade validos: " + qtdValidos);
        System.out.println("soma: " + soma);

        if (qtdValidos > 0) {
            double media = (double) soma / qtdValidos;
            System.out.println("media: " + media);
            System.out.println("maior: " + maior);
            System.out.println("menor: " + menor);
        } else {
            System.out.println("media: (nao existe, qtd=0)");
            System.out.println("maior: (nao existe, qtd=0)");
            System.out.println("menor: (nao existe, qtd=0)");
        }

        System.out.println("pares: " + qtdPares);
        System.out.println("impares: " + qtdImpares);

        sc.close();
    }
}
