import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Crear lista
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar números
        numeros.add(100);
        numeros.add(25);
        numeros.add(80);
        numeros.add(10);
        numeros.add(60);

        // Orden descendente
        Collections.sort(numeros, Collections.reverseOrder());

        // Mostrar resultado
        System.out.println("Números ordenados de mayor a menor:");
        System.out.println(numeros);
    }
}
