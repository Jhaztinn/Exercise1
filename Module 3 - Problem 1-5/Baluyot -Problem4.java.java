import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programmed by: Jhaztintroy Baluyot");
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        scanner.close();
    }
}