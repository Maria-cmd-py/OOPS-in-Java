import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
/*Explanation:
Takes a number (e.g., 5) as input.
Calculates factorial by multiplying numbers from 1 to n:
Example: 5! = 1 × 2 × 3 × 4 × 5 = 120.
Prints the result.*/