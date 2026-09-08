/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaiceryn F Dela Cruz
 */
import java.util.Scanner;

public class DelaCruz_Module2Problem10 {
    public static void main(String[] args) {
        System.out.println("Programmed by: Jaiceryn Dela Cruz");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        String employeeId = scanner.nextLine();

        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("Enter hourly rate: ");
        double hourlyRate = Double.parseDouble(scanner.nextLine().trim());

        System.out.println();
        System.out.println("----- Employee Payroll Record -----");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID  : " + employeeId);
        System.out.println("Position     : " + position);
        System.out.println("Hours Worked : " + hoursWorked);
        System.out.printf("Hourly Rate  : PHP %.2f%n", hourlyRate);

        scanner.close();
    }
}