package fases.desafios;

import java.util.Scanner;

public class DesafioScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga um numero inteiro:");
        int num = sc.nextInt();

        while (num < 0 || num == 0) {
            System.out.println("numero invalido, digite novamente:");
            num = sc.nextInt();
        }sc.close();System.out.println("Numero valido:"+num);

    }
}
