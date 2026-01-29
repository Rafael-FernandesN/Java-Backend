package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E20MediaMenosNNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;   // Acumulador para as notas
        int qtd = 0;      // Contador de quantas notas foram digitadas
        double nota = 0;   // Variável para ler a entrada atual

        System.out.println("Digite as notas (ou -1 para encerrar):");

        // O laço continua enquanto a nota for diferente de -1
        while (true) {
            System.out.print("Nota: ");
            nota = sc.nextDouble();

            // Se for o sentinela, paramos o loop imediatamente com 'break'
            if (nota == -1) {
                break;
            }

            soma += nota; // soma = soma + nota
            qtd++;        // qtd = qtd + 1
        }

        // Verificamos se houve pelo menos uma nota válida para evitar divisão por zero
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