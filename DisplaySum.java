/* 3.               Display Sum of Three Numbers
 Task: Ask the user for three numbers and display their sum.*/
import java.util.Scanner;
public class DisplaySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("\nThe sum of the three numbers is: " + sum);
        scanner.close();
    }
}
/*Explanation:
Takes three numbers as input from the user.
Adds them together (num1 + num2 + num3).
Prints the total sum.*/