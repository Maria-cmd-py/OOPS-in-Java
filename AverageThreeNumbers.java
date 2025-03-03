import java.util.Scanner;
public class AverageThreeNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter third number: ");
            double num3 = scanner.nextDouble();
            double average = (num1 + num2 + num3) / 3;
            System.out.println("Average: " + average);
        }
}
/*Explanation:
Takes three numbers as input.
Calculates the average by adding them and dividing by 3.
Uses double to ensure decimal precision (e.g., average of 10, 20, 30 is 20.0).*/