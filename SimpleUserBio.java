import java.util.Scanner;
public class SimpleUserBio {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        //Enter the name using scanner
        System.out.println("Enter your Name: ");
        String name = input.nextLine();
        //Enter the roll number
        System.out.println("Enter your Roll No : ");
        int RollNo = input.nextInt();
        input.nextLine();
        // Enter the Section
        System.out.println("Enter Section: ");
        String Section = input.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + RollNo);
        System.out.println("Section: " + Section);
    }
}
/*Explanation:
The program asks the user to enter their name, roll number, and section.
It stores these values in variables (name, rollNo, section).
Finally, it prints the collected information in a formatted way.*/