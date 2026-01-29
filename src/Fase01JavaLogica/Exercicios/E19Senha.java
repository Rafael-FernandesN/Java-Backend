package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E19Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta  = 1234;
        System.out.println("Digite seu senha: ");
         int senhaIncorreta = sc.nextInt();
        while (senhaCorreta != senhaIncorreta) {
            System.out.println("Senha incorreta");
            System.out.println("Digite seu senha novamente: ");
            senhaIncorreta = sc.nextInt();
        }
        System.out.println("Senha correta");
        System.out.println("Acesso Liberado!");
        sc.close();
    }
}
