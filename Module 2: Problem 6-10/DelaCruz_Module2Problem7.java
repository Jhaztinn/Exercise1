/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaiceryn F Dela Cruz
 */
import java.util.Scanner;

public class DelaCruz_Module2Problem7 {
    public static void main(String[] args) {
        System.out.println("Programmed by: Jaiceryn Dela Cruz");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter current balance: ");
        double balance = Double.parseDouble(scanner.nextLine().trim());

        System.out.println();
        System.out.println("----- Bank Account Record -----");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type  : " + accountType);
        System.out.printf("Balance       : PHP %.2f%n", balance);

        scanner.close();
    }
}