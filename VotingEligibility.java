import java.util.Scanner;
public class VotingEligibility {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }
}
/*Explanation:
Asks the user for their age.
Uses an if-else statement:
If age is 18 or older: Prints "eligible".
If younger than 18: Prints "not eligible".*/