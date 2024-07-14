// Neriah Faith L. Villapana
// Shawn Uriel S. Cabutihan

import java.util.*;

public class TestStudent{
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        Student student1 = new Student(9000);

        System.out.print("Enter the student number: "); student1.setStudNum(input.nextLine());
        System.out.print("Enter the student name: "); student1.setStudName(input.nextLine());
        System.out.print("Enter the student program and section: "); student1.setStudProgram(input.nextLine());
        System.out.print("Enter the total units enrolled: "); student1.setStudUnits(input.nextDouble());
        System.out.print("Enter the rate per unit: "); double rate = input.nextDouble();
        student1.PrintCertDetails();
        student1.computeTotal(rate);
    }
}