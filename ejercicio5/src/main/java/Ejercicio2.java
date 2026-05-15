import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Crear lista
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar nombres
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("José");

        // Ordenar alfabéticamente
        Collections.sort(nombres);

        // Mostrar lista
        System.out.println("Nombres ordenados:");
        System.out.println(nombres);
    }
}
