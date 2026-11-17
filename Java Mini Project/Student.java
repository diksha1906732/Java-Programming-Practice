
import java.util.*;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[][] marks = new int[5][3];

        int topper = 0;
        double maxPercentage = 0;

       
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter subject " + (j + 1) + " marks: ");
                marks[i][j] = sc.nextInt();
            }

            sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {

            int total = 0;
            int highest = marks[i][0];
            int lowest = marks[i][0];

            for (int j = 0; j < 3; j++) {

                total = total + marks[i][j];

                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                }

                if (marks[i][j] < lowest) {
                    lowest = marks[i][j];
                }
            }

            double percentage = total / 3.0;

            System.out.println("\n====Student Report Card=====\n");

            System.out.println("\nStudent Name: " + names[i]);
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage);
            System.out.println("Highest Marks: " + highest);
            System.out.println("Lowest Marks: " + lowest);

            if (percentage >= 75) {
                System.out.println("Grade: Distinction");
            }
            else if (percentage >= 60) {
                System.out.println("Grade: First Class");
            }
            else if (percentage >= 50) {
                System.out.println("Grade: Second Class");
            }
            else if (percentage >= 35) {
                System.out.println("Grade: Pass");
            }
            else {
                System.out.println("Grade: Fail");
            }

            if (percentage > maxPercentage) {
                maxPercentage = percentage;
                topper = i;
            }
        }
        System.out.println("\nTopper: " + names[topper]);
        System.out.println("Highest Percentage: " + maxPercentage);

    }
}
