/*Create a class that will prompt an employee number and hourly pay rate. 
Then, print if the user enters valid data based on the following errors to handle:
 * "The employee number is not numeric.", 
 * "The employee number is less than 1000", 
 * "The employee number is greater than 9999",
 * "The hourly pay rate is not numeric.", 
 * "The hourly pay rate is less than $9.00."
 * "The hourly pay rate is greater than $25.00.
 * 
 * Valid employee number should be from 1000 to 9999
 * Valid hourly pay rate should be from $9.00 to $25.00 
 */
import java.util.*;
public class EmployeeDataEntry{
    static Scanner in = new Scanner(System.in);
    static int empNo;
    static double hp;
    static boolean flag = false;
    public static void main(String[] args) {
        try{
            System.out.print("Enter an employee number: ");
            empNo = in.nextInt();
            flag = true;
            System.out.print("Enter an hourly pay rate: $ ");
            hp = in.nextDouble();
            check();
            System.out.println("Valid employee data");
        } catch(InputMismatchException mex){
            if(flag)
                System.out.println(EmployeeMessages.errorMessage[3]);
            else
                System.out.println(EmployeeMessages.errorMessage[0]);
        } catch(EmployeeException oex){
                System.out.println(oex.getMessage());  
        } catch(Exception ex){
            System.out.println("An exception happened!");   
        }
    }
    public static void check() throws EmployeeException{
        /*  *The employee number is not numeric, less than 1000, or more than 9999.
    *The hourly pay rate is not numeric, less than $9.00, or more than $25.00.
 */
        if (empNo < 1000)
            throw new EmployeeException(EmployeeMessages.errorMessage[1]);
        if (empNo > 9999)
            throw new EmployeeException(EmployeeMessages.errorMessage[2]);
        if (hp < 9)
            throw new EmployeeException(EmployeeMessages.errorMessage[4]);
        if (hp > 25)
            throw new EmployeeException(EmployeeMessages.errorMessage[5]);        

    }
}