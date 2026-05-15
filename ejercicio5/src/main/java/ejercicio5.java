import java.util.LinkedList;

public class ejercicio5 {

    public static void main(String[] args) {

        LinkedList<String> productos = new LinkedList<>();

        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");

        System.out.println("Lista original:");
        System.out.println(productos);

        productos.remove("Mouse");

        System.out.println("Lista actualizada:");
        System.out.println(productos);
    }
}