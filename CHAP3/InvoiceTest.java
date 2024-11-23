import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите номер детали: ");
        String partNumber = input.nextLine();

        System.out.print("Введите описание детали: ");
        String partDescription = input.nextLine();

        System.out.print("Введите количество: ");
        int quantity = input.nextInt();

        System.out.print("Введите цену за единицу: ");
        double pricePerItem = input.nextDouble();

        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        System.out.printf("%nСчет на оплату:%n");
        System.out.printf("Номер детали: %s%n", invoice.getPartNumber());
        System.out.printf("Описание детали: %s%n", invoice.getPartDescription());
        System.out.printf("Количество: %d%n", invoice.getQuantity());
        System.out.printf("Цена за единицу: $%.2f%n", invoice.getPricePerItem());
        System.out.printf("Общая сумма счета: $%.2f%n", invoice.getInvoiceAmount());

        input.close();
    }
}
