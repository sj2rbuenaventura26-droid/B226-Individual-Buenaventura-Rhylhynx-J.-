package Day12.Activity;

import java.util.Scanner;

public class Activity8_Buenaventura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("         Average Calculator");
        System.out.println("======================================");

        
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();
        scanner.nextLine();

        
        String[] subjectNames = new String[subjects];
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];
        double[] averages = new double[students];

        
        System.out.println("\nEnter subject names:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = scanner.nextLine();
        }

        
        for (int i = 0; i < students; i++) {

            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            double sum = 0;

            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < subjects; j++) {

                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = scanner.nextDouble();

                sum += grades[i][j];
            }

            averages[i] = sum / subjects;
            scanner.nextLine();
        }

                   
        System.out.println("\n======================================");
        System.out.println("            Grades Report");
        System.out.println("======================================");

        System.out.printf("%-15s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-10s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < students; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-10.0f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", averages[i]);
        }

        scanner.close();
    }
}