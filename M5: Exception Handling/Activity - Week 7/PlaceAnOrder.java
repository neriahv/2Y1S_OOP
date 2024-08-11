import java.util.*;
import java.text.DecimalFormat;

public class PlaceAnOrder {
    static Scanner input = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#,##0.00");

    static boolean flag = false;
    static int[] numList = {111, 222, 333, 444};
    static double[] priceList = {50.77, 83.85, 138.61, 341.67};
    public static void main(String[] args) {
        try{
            System.out.print("Enter item number : ");
            int itemInput = input.nextInt();
            flag = true;
            System.out.print("Enter quantity : ");
            int quantInput = input.nextInt();

            validateInput(itemInput, quantInput);

            double total = computeTotal(itemInput, quantInput);
            System.out.println("Complete Order. Total Php " + df.format(total));
            System.out.println("\t(" + quantInput + " at Php " + df.format(total/quantInput) + " each)");

        } catch (InputMismatchException e){
            if (flag){
                System.out.println(OrderMessages.error_message[1]);
            } else {
                System.out.println(OrderMessages.error_message[0]);
            }
        } catch (OrderException e){
            System.out.println(e.getMessage());
        }
    }

    public static void validateInput(int itemInput, int quantInput) throws OrderException{
        if (itemInput < 0) {
            throw new OrderException(OrderMessages.error_message[2]);
        } else if (itemInput > 9999) {
            throw new OrderException(OrderMessages.error_message[3]);
        } else if (!validateItemNumber(itemInput)){
            throw new OrderException(OrderMessages.error_message[6]);
        }

        if (quantInput < 1){
            throw new OrderException(OrderMessages.error_message[4]);
        } else if (quantInput > 12){
            throw new OrderException(OrderMessages.error_message[5]);
        }
    }

    public static boolean validateItemNumber(int itemInput){
        for (int i : numList){
            if (i == itemInput){
                return true;
            }
        }
        return false;
    }

    public static double computeTotal(int itemInput, int quantInput) {
        int index = -1;
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] == itemInput) {
                index = i;
                break;
            }
        }
        return priceList[index] * quantInput;
    }
}
