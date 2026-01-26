package fases.fase2.exercicios;

import java.util.Scanner;

public class E14ValidacaoNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        double nota =  sc.nextDouble();
        while (nota < 0 || nota > 10){
            System.out.println("Nota invalida!Digite novamente: ");
            System.out.println("digite sua nota(0 a 10):");
            nota = sc.nextDouble();
        }
    System.out.println("Nota final: " + nota);
        sc.close();
    }
}