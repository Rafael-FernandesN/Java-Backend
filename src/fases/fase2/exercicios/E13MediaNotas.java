package fases.fase2.exercicios;

import java.util.Scanner;
public class E13MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 3; i++){
            System.out.println("Digite a nota"+ i +":");
            double nota = sc.nextDouble();
            soma += nota;

        }
        double media = soma / 3;
        System.out.println("Média: " + media);
        if (media >= 7){
            System.out.println("Status: Aprovado!");
        }else if (media >= 5){
            System.out.println("Status: Recuperação!");
        }else {
            System.out.println("Reprovado!");
        }
        sc.close();
    }
}
