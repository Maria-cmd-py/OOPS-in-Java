import java.util.Scanner;
public class PerimeterOfARectangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            double perimeter = 2 * (length + width);
            System.out.println("Perimeter: " + perimeter);
        }
}
/*Explanation:
The user provides the length and width of a rectangle.
The program calculates the perimeter using the formula:
Perimeter = 2 × (Length + Width).
Displays the result (e.g., for length=5 and width=3, perimeter=16).*/
