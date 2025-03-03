import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (%, ^): ");
        char op = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        switch(op) {
            case '%':
                System.out.println("Result: " + (num1 % num2));
                break;
            case '^':
                System.out.println("Result: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
/*Explanation:
Takes two numbers and an operator (% or ^) as input.
Uses switch to perform the operation:
Modulo (%): Computes the remainder (e.g., 10 % 3 = 1).
Exponentiation (^): Calculates power using Math.pow() (e.g., 2^3 = 8).
Prints the result or "Invalid operator" if the symbol is unrecognized.*/
