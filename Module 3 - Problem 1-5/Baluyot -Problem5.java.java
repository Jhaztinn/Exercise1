import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("Programmed by: Jhaztintroy Baluyot");
   

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter quiz grade: ");
   double quiz = scanner.nextDouble();

   System.out.print("Enter project grade: ");
   double project = scanner.nextDouble();

    System.out.print("Enter exam grade: ");
    double exam = scanner.nextDouble();

   double finalGrade = (quiz * 0.30) + (project * 0.30) + (exam * 0.40);

   System.out.println("Final Grade: " + finalGrade);

    scanner.close();
    }
}