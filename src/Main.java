import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double subtotal, gratuityRate;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate: ");
        gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.printf("The gratuity is $%.2f\n", gratuity);
        System.out.printf("The total amount is $%.2f\n", total);

        input.close();
    }
}