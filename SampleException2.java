import java.util.InputMismatchException;
import java.util.Scanner;
public class SampleException2{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            int n = 0;
            int d = 0;
            //int re = 0;
            System.out.print("Enter a numerator: ");
            n = in.nextInt();
            System.out.print("Enter a denominator: ");
            d = in.nextInt();
            System.out.println("The quotient is: " + div(n, d));
        }
        catch(ArithmeticException exa){
            System.out.println("Error: " + exa.getMessage());
        }
        catch(InputMismatchException exi){
            System.out.println("Integer data only!");
        }
        catch(Exception ex){    
            System.out.println("An exception happened! ");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }            
        finally{
            System.out.println("Program terminated...");
        }
    }
    public static double div(int a, int b) throws ArithmeticException{
        if (b == 0)
            throw new ArithmeticException("Invalid denominator!");
        return (double) (a/b);
    }

}