package Fase01JavaLogica.Desafios;

import java.util.Scanner;

public class D01MediaInteligente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma =  0 ;
        double contador = 0 ;
        double nota = 0 ;
        while(nota != -1){
            System.out.println("Digite a nota (ou -1 para sair): ");
            nota = sc.nextDouble();
            if(nota < 0){
                break;
            }else if(nota < 0 || nota > 10){
                System.out.println("Nota invalida!");
            System.out.println("Nota é valida se somente for maior que 0 e manor que 10");
                System.out.println("Digite a nota: ");
                nota = sc.nextDouble();
            }else {
                soma =  soma +nota;
                contador = contador +1;
            }
        }
        if(contador >0){
            double media = soma / contador;
            System.out.println("Processamento concluido com sucesso!");
            System.out.println("Total de notas: " + contador);
            System.out.println("Media: " + media);
        }
        sc.close();
    }
}