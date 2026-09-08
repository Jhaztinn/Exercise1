/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaiceryn F Dela Cruz
 */
import java.util.Scanner;

public class DelaCruz_Module2Problem8 {
    public static void main(String[] args) {
        System.out.println("Programmed by: Jaiceryn Dela Cruz");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter subject code: ");
        String subjectCode = scanner.nextLine();

        System.out.print("Enter subject title: ");
        String subjectTitle = scanner.nextLine();

        System.out.print("Enter units: ");
        int units = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Enter section letter: ");
        char section = scanner.nextLine().trim().charAt(0);

        System.out.println();
        System.out.println("----- Course Enrollment Record -----");
        System.out.println("Student Name : " + studentName);
        System.out.println("Subject Code : " + subjectCode);
        System.out.println("Subject Title: " + subjectTitle);
        System.out.println("Units        : " + units);
        System.out.println("Section      : " + section);

        scanner.close();
    }
}