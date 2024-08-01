public class Student {
    private int studentNum;
    private String name;
    private String[] subjects;
    private float[] grades;

    public Student(int studentNum, String name, String[] subjects, float[] grades){
        this.studentNum = studentNum;
        this.name = name;
        this.subjects = subjects;
        this.grades = grades;
    }

    public int getNum(){
        return studentNum;
    }
    public String getName(){
        return name;
    }
    public String[] getSubjects(){
        return subjects;
    }

    public double calculate(){
        double grade = 0.0;
        int counter = 0;
        for (int i=0; i<grades.length; i++){
            grade += grades[i];
            counter += 1;
        }
        double average = grade/counter;
        return average;
    }

}
