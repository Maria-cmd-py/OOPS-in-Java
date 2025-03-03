import java.util.Scanner;
public class MinutesToHoursToMinutes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter total minutes: ");
            int totalMinutes = scanner.nextInt();
            int hours = totalMinutes / 60;
            int minutes = totalMinutes % 60;
            System.out.println(hours + " hours and " + minutes + " minutes");
        }
}
/*Explanation:
Takes total minutes (e.g., 125) as input.
Hours: Divide by 60 (e.g., 125 / 60 = 2 hours).
Remaining Minutes: Use the remainder (%) operator (e.g., 125 % 60 = 5 minutes).
Prints the converted time (e.g., "2 hours and 5 minutes").*/