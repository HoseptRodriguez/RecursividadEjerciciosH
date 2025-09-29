package listas;

import java.util.ArrayList;
import java.util.List;

public class SumaLista {
    
    // Método recursivo para sumar los elementos de una lista
    public static int sumarLista(List<Integer> lista, int indice) {
        if (indice == lista.size()) { 
            return 0; // Caso base: cuando llegamos al final de la lista
        } else {
            return lista.get(indice) + sumarLista(lista, indice + 1); 
        }
    }

    public static void main(String[] args) {
        // Crear una lista de enteros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);

        // Llamada al método recursivo
        int suma = sumarLista(numeros, 0);

        System.out.println("La lista es: " + numeros);
        System.out.println("La suma de los elementos es: " + suma);
    }
}