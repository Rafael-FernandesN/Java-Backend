package Fase02EstruturasDeDados.Exercicios;

import java.util.Scanner;

public class E01LeituraBlindada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        while (numero <= 0 || numero >1000) {
            System.out.println("Numero invalido");
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Numero valido: " + numero);
        sc.close();
    }

}
