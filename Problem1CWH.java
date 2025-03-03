///*                                    **Exercise 1.1**
//Write a Program to calculate percentage of a given student in CBSE board exam.
//His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100).*/
//import java.util.Scanner;
//public class Problem1CWH {
//    public static void main(String[] args){
//        System.out.println("\t \t \t \t Enter the marks of Students ");
//        int maths,comp,phy,pf,ict;
//        Scanner input = new Scanner(System.in);
//        // Takes input from the user.
//        System.out.println("Enter the marks of Physics :");
//        phy = input.nextInt();
//        System.out.println("Enter the marks of Maths :");
//        maths = input.nextInt();
//        System.out.println("Enter the marks of ICT :");
//        ict = input.nextInt();
//        System.out.println("Enter the marks of PF :");
//        pf = input.nextInt();
//        System.out.println("Enter the marks of Computer :");
//        comp = input.nextInt();
//        // Calculate the sum of all subjects.
//        double sum = maths + pf + ict + phy + comp;
//        System.out.println("Calculate the sum of all subjects : " + sum);
//        // Calculate the Percentage of the CBSE result.
//        double percentage = (sum / 500) * 100;
//        System.out.println("The Percentage of a given student in CBSE board exam is : " + percentage);
//    }
//}

/*Write a Program to sum 3 numbers in java? */
    import java.util.Scanner;
public class Problem1CWH{
    public static void main(String[] args){
        int a, b, c, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = input.nextInt();
        System.out.println("Enter the value of b : ");
        b = input.nextInt();
        System.out.println("Enter the value of c : ");
        c = input.nextInt();
        sum = a + b + c;
        System.out.println("The Sum of three values are : " + sum );
    }
}
