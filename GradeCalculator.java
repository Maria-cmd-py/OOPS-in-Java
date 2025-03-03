import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        char grade;
        if (marks >= 80) grade = 'A';
        else if (marks >= 70) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else if (marks >= 50) grade = 'D';
        else grade = 'F';
        System.out.println("Grade: " + grade);
    }
}
/*Explanation:
Takes marks (e.g., 85) as input.
Assigns a grade using conditions:
A for 80-100, B for 70-79, C for 60-69, D for 50-59, F below 50.
Prints the grade (e.g., 85 → 'A').*/