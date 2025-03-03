import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " is larger.");
        } else if (a < b) {
            System.out.println(b + " is larger.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}