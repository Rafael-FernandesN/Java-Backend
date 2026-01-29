package Fase01JavaLogica.Exercicios;

import java.util.Scanner;

public class E21MenuSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        System.out.println("-------MENU SIMPLES-------");
        System.out.println("01 - Somar dois números");
        System.out.println("02 - Subtrair dois números");
        System.out.println("03 - Multiplicar dois números");
        System.out.println("04 - Dividir dois números");
        System.out.println("05 - Sair");
        System.out.println("---------------------");
        System.out.print("Digite sua opção: ");

        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o primeiro numero: ");
                double somaN1 = sc.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double somaN2= sc.nextDouble();
                double soma = somaN1 + somaN2;
                System.out.println("Resultado: " + soma);
                break;
                    case 2:
                        System.out.println("Digite o primeiro numero: ");
                        double subN1 = sc.nextDouble();
                        System.out.println("Digite o segundo numero: ");
                        double subN2 = sc.nextDouble();
                        double sub = subN1 - subN2;
                        System.out.println("Resultado: " + sub);
                        break;
                            case 3:
                                System.out.println("Digite o primeiro numero: ");
                                double mulN1 = sc.nextDouble();
                                System.out.println("Digite o segundo numero: ");
                                double mulN2 = sc.nextDouble();
                                double mul = mulN1 * mulN2;
                                System.out.println("Resultado: " + mul);
                                break;
                                    case 4:
                                        System.out.println("Digite o primeiro numero: ");
                                        double divN1 = sc.nextDouble();
                                        System.out.println("Digite o segundo numero: ");
                                        double divN2 = sc.nextDouble();
                                        double div = divN1 / divN2;
                                        System.out.println("Resultado: " + div);
                                        break;
                                        default:
                                            System.out.println("----ENCERRANDO PROGRAMA----");
                                            break;

        }
        sc.close();
    }
}
