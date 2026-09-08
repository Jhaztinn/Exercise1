/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaiceryn F Dela Cruz
 */
import java.util.Scanner;

public class DelaCruz_Module2Problem6 {
    public static void main(String[] args) {
        System.out.println("Programmed by: Jaiceryn Dela Cruz");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();

        System.out.print("Enter director: ");
        String director = scanner.nextLine();

        System.out.print("Enter release year: ");
        int releaseYear = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Enter runtime (minutes): ");
        int runtime = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Enter rating: ");
        double rating = Double.parseDouble(scanner.nextLine().trim());

        System.out.println();
        System.out.println("----- Movie Information Record -----");
        System.out.println("Title       : " + title);
        System.out.println("Director    : " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Runtime     : " + runtime + " minutes");
        System.out.println("Rating      : " + rating);

        scanner.close();
    }
}