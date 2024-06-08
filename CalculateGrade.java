import java.util.Scanner;

public class CalculateGrade
 {

    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            totalMarks += sc.nextInt();
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + calculateGrade(averagePercentage));

        sc.close();
    }

    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) return 'A';
        if (averagePercentage >= 80) return 'B';
        if (averagePercentage >= 70) return 'C';
        if (averagePercentage >= 60) return 'D';
        if (averagePercentage >= 50) return 'E';
        return 'F';
    }
}
