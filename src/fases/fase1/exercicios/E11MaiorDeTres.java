package fases.fase1.exercicios;

public class E11MaiorDeTres {
    public static void main(String[] args) {
        int a = 10 , b = 12 , c = 0;
        if  (a > b && b > c) {
            System.out.println("Maior:"+ a);
        } else if  (b > a && a > c) {
            System.out.println("Maior:"+ b);
        }else if  ( c > a && a > b) {
            System.out.println("Maior:"+ c);
        }
    }
}
