public class Patient {
    private int patientID;
    private String fullName;
    private String[] consultations;
    public static String doctorName;

    public Patient (){
    }
    public void setPatientID (int patient){
        patientID = patient;
    }
    public int getPatientID(){
        return patientID;
    }
    public void setName (String patient){
        fullName = patient;
    }
    public String getName(){
        return fullName;
    }
    public void setConsultations(String[] patient){
        consultations = patient;
    }
    public String [] getConsultations(){
        return consultations;
    }
    public void setDoctorName(String patient){
        doctorName = patient;
    }
    public String getDoctorName(){
        return doctorName;
    }
    public void printPatientDetails(){
        System.out.println("Patient Details: ");
        System.out.println("\tID: " + patientID);
        System.out.println("\tFull Name: " + fullName);
        System.out.println("\tConsultations: ");
        for (String element: consultations){
            System.out.println("\t\t"+element);
        }
        System.out.println("\tDoctor's Name: " + doctorName);
    }
}
