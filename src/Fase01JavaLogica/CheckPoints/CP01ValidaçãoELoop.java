package Fase01JavaLogica.CheckPoints;

import java.util.Scanner;

public class CP01ValidaçãoELoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "digite um inteiro positivo: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Numero invalido");
            System.out.println( "Digite um inteiro positivo: ");
            n = sc.nextInt();
        }
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
