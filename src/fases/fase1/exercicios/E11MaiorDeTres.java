
package fases.fase1.exercicios;

public  class E11MaiorDeTres {
    public static void main(String[] args) {
        int a = 10, b = 12, c = 0;

        if (a > b && a > c) {
            System.out.println("Maior: " + a);
        } else if (b > a && b > c) {
            System.out.println("Maior: " + b);
        } else {
            System.out.println("Maior: " + c);
        }
    }
}
