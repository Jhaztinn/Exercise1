import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programmed by: Jhaztintroy Baluyot");

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        double grossSalary = hoursWorked * hourlyRate;

        System.out.println("Gross Salary: PHP " + grossSalary);

        scanner.close();
    }
}
