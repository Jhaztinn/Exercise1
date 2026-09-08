/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaiceryn F Dela Cruz
 */
import java.util.Scanner;

public class DelaCruz_Module2Problem9 {
    public static void main(String[] args) {
        System.out.println("Programmed by: Jaiceryn Dela Cruz");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter character name: ");
        String characterName = scanner.nextLine();

        System.out.print("Enter level: ");
        int level = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Enter experience points: ");
        long experiencePoints = Long.parseLong(scanner.nextLine().trim());

        System.out.print("Enter rank: ");
        String rank = scanner.nextLine();

        System.out.println();
        System.out.println("----- Online Game Player Profile -----");
        System.out.println("Username         : " + username);
        System.out.println("Character Name   : " + characterName);
        System.out.println("Level            : " + level);
        System.out.println("Experience Points: " + experiencePoints);
        System.out.println("Rank             : " + rank);

        scanner.close();
    }
}