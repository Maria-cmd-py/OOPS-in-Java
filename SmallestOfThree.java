import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        System.out.println("Smallest number: " + smallest);
    }
}
/*Explanation:
Takes three numbers as input.
Compares them step-by-step:
Assume the first number (a) is the smallest.
If the second number (b) is smaller, update smallest to b.
If the third number (c) is smaller, update smallest to c.
Prints the smallest number.*/
