public class E24ParOuImpar {

    // Método que recebe um inteiro e retorna "par" ou "ímpar"
    public static String parOuImpar(int n) {
        if (n % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }

    public static void main(String[] args) {
        System.out.println(parOuImpar(10)); // par
        System.out.println(parOuImpar(7));  // ímpar
        System.out.println(parOuImpar(0));  // par
        System.out.println(parOuImpar(-3)); // ímpar
    }
}
