import java.util.ArrayList;
import java.util.Collections;

public class ejercicio1 {

    public static void main(String[] args) {

        // Crear ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar números
        numeros.add(45);
        numeros.add(12);
        numeros.add(78);
        numeros.add(5);
        numeros.add(30);

        // Ordenar ascendente
        Collections.sort(numeros);

        // Mostrar resultado
        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(numeros);
    }
}