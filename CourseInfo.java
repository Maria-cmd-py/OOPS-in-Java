/*1. Display Course Information
Task: Write a program that displays the course name, instructor name, and semester number.
Example Output:
Course: Object-Oriented Programming
Instructor: Ms. Sana
Semester: 2nd*/
public class CourseInfo {
    public static void main(String[]args) {
        String courseName = "Object-Oriented Programming";
        String instructorName = "Ms. Sana";
        String semesterNo = "2nd";
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor Name: " + instructorName );
        System.out.println("Semester No: " + semesterNo);
    }
}
/*Explanation:
This program directly prints three lines of text:
The course name ("Object-Oriented Programming").
The instructor's name ("Ms. Sana").
The semester ("2nd").
It uses System.out.println() to display the information without any input from the user.*/