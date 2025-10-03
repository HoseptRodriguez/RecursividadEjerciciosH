package fibonacci;

public class Fibonacci {
    
    public static int calcularFibonacci(int n) {
        if (n == 0) { 
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2); 
        }
    }

    public static void main(String[] args) {
        int numero = 7; 
        System.out.println("El número Fibonacci en la posición " + numero + " es: " + calcularFibonacci(numero));
    }
}
