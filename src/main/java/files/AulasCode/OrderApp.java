package files.AulasCode;

public class OrderApp {
    public static void main(String[] args) {

        System.out.println("\nOrderApp.java");

        Order order = new Order("João", "Rua 1, 100");
        order.insertProduct("Mouse", 50, 2);
        order.insertProduct("Teclado", 100, 1);
        order.insertProduct("Monitor", 500, 1);
        order.printOrder();
    }
}