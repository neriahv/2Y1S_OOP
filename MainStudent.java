import java.util.*;
import java.text.DecimalFormat;

public class MainStudent {
    static Scanner input = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#,##0.00");

    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        Student[] students = new Student[number];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter Details for Student " + (i + 1));
            float[] grades = new float[5];
            String[] subj = {"6OOP", "6COMETHICS", "4ETHICS", "6DSAL", "2CALC-IT"};
            System.out.print("Enter student number: ");
            int studNum = input.nextInt();
            System.out.print("Enter student name: ");
            String name = input.next();
            System.out.println("Enter grades for 5 subjects:");

            for (int j = 0; j < subj.length; j++) {
                System.out.print("Enter " + subj[j] + " grade: ");
                float grade = input.nextFloat();
                while (true) {
                    if (grade <= 0) {
                        System.out.println("Invalid Input. Grade cannot be negative.");
                        System.out.print("Enter " + subj[j] + " grade: ");
                        grade = input.nextFloat();
                    } else {
                        grades[j] = grade;
                        break;
                    }
                }
            }
            students[i] = new Student(studNum, name, subj, grades);
        }

        System.out.println("Students Information:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Student Number: " + students[i].getNum());
            System.out.println("Name: " + students[i].getName());
            System.out.println("Subjects: " + Arrays.toString(students[i].getSubjects()));
            System.out.println("Average Grades: " + df.format(students[i].calculate()));
        }
    }
}