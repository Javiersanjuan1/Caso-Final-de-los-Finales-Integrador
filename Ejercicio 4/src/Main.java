public class Main {
    public static void main(String[] args) {
        int numero = 102;
        int sumaDigitos = sumaDigitosRecursiva(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos);
    }

    public static int sumaDigitosRecursiva(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            int digito = numero % 10;
            return digito + sumaDigitosRecursiva(numero / 10);
        }
    }
}
