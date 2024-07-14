// Neriah Faith L. Villapana
// Shawn Uriel S. Cabutihan

import java.text.DecimalFormat;

public class Student{
    static DecimalFormat df = new DecimalFormat("#,##0.00");

    private String studNum;
    private String studName;
    private String studProgram;
    private double studUnits;
    private double studTuition;
    public double studMisc;

    public Student(double misc){
        studMisc = misc;
    }

    public void setStudNum(String student){
        studNum = student;
    }

    public String getStudNum(){
        return studNum;
    }

    public void setStudName(String student){
        studName = student;
    }

    public String getStudName(){
        return studName;
    }

    public void setStudProgram (String student){
        studProgram = student;
    }

    public String getStudProgram(){
        return studProgram;
    }

    public void setStudUnits(double student){
        studUnits = student;
    }

    public double getStudUnits(){
        return studUnits;
    }

    public void computeTotal(double rate){
        studTuition = (studUnits * rate) + studMisc;
        System.out.print("\tTotal Tuition Fee: P " + df.format(studTuition));
    }

    public void PrintCertDetails(){
        System.out.println("Student Certificate of Enrollment:");
        System.out.println("\tStudent Number: " + studNum);
        System.out.println("\tName: " + studName);
        System.out.println("\tProgram and Section: " + studProgram);
        System.out.println("\tTotal Units Enrolled: " + df.format(studUnits));
    }
}
