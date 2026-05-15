import java.util.LinkedList;

public class ejercicio4 {

    public static void main(String[] args) {

        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Carlos");
        nombres.add("María");
        nombres.add("José");

        nombres.addFirst("Ana");
        nombres.addLast("Luis");

        System.out.println("Lista de nombres:");
        System.out.println(nombres);
    }
}
