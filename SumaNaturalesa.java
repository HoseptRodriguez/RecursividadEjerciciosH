package sumanaturalesa;

public class SumaNaturalesa {
    
    // Método recursivo para sumar los números naturales
    public static int sumaNaturalesa(int n) {
        if (n == 1) { 
            return 1; // Caso base
        } else {
            return n + sumaNaturalesa(n - 1); 
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("La suma de los primeros " + numero + " numeros naturales es: " + sumaNaturalesa(numero));
    }
}



