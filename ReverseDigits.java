import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed: " + reversed);
    }
}
/*Explanation:
Takes a number (e.g., 1234) as input.
Reverses its digits using a while loop:
Extract the last digit (e.g., 1234 % 10 = 4).
Build the reversed number (4 → 43 → 432 → 4321).
Remove the last digit from the original number (1234 → 123 → 12 → 1 → 0).
Prints the reversed number (4321).
*/
