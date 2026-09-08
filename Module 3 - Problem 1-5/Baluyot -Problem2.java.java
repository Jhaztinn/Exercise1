import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Programmed by: Jhaztintroy Baluyot");

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double subtotal = price * quantity;
        double vat = subtotal * 0.12;
        double total = subtotal + vat;

        System.out.println("Subtotal: PHP " + subtotal);
        System.out.println("VAT: PHP " + vat);
        System.out.println("Total: PHP " + total);

        scanner.close();
    }
}
