/*our Task
Write a Java class named Student with attributes name, age, and grade.
Create a method displayDetails() to print student details.
In the main() method, create a Student object and call displayDetails().*/
class Student {
    String name;
    int age;
    char grade;

    void displayDetail(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
    }
}
public class Main {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Maria Atta";
        student1.age = 18;
        student1.grade = 'B';
        student1.displayDetail();
    }
}