import java.util.Scanner;

public class TestPatient {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String[] date1 = new String[]{"June 2, 2020", "July 3, 2020"};
       
        Patient neriah = new Patient();
        neriah.setPatientID(1);
        neriah.setName("Neriah Villapana");
        neriah.setConsultations(date1);
        neriah.doctorName("Dr. Sy");
        neriah.printPatientDetails();

        String[] date2 = new String[]{"June 8, 2020", "July 9, 2020"};
        Patient faith = new Patient();
        faith.setPatientID(2);
        faith.setName("Faith Lopez");
        faith.setConsultations(date2);
        faith.doctorName("Dr. Belo");
        faith.printPatientDetails();
    }
}
