import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 3 or 5");
        }
    }
}
/*Explanation:
Checks divisibility using % (remainder operator):
If divisible by both 3 and 5 (e.g., 15), prints "both".
If divisible by 3 only (e.g., 9), prints "3".
If divisible by 5 only (e.g., 10), prints "5".
Otherwise, prints "not divisible".*/