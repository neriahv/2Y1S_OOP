import java.util.*;

public class UseOrder {
    static Scanner input = new Scanner (System.in);
    public static void main (String args[]){
        try{
            System.out.println("\nEnter Order Details");

            System.out.print("Enter Customer Number: ");
            int cusNum = input.nextInt();
            if (cusNum < 1000) {
                throw new DataException(DataMessages.errorMsg[1]);
            } else if (cusNum > 5000) {
                throw new DataException(DataMessages.errorMsg[2]);
            }

            System.out.print("Enter Item Description: ");
            String itemDes = input.next();

            System.out.print("Enter quantity: ");
            int quant = input.nextInt();
            if (quant < 0){
                throw new DataException(DataMessages.errorMsg[3]);
            }

            System.out.print("Enter item price: Php ");
            double price = input.nextDouble();
            if (price < 0){
                throw new DataException(DataMessages.errorMsg[4]); 
            } else if (price > 10000) {
                throw new DataException(DataMessages.errorMsg[5]);
            }
            Order order = new Order(cusNum, itemDes, quant, price);
    
            System.out.println("\nEnter Shipped Order Details");
            System.out.print("Enter Customer Number: ");
            cusNum = input.nextInt();
            System.out.print("Enter Item Description: ");
            itemDes = input.next();
            System.out.print("Enter quantity: ");
            quant = input.nextInt();
            System.out.print("Enter item price: Php ");
            price = input.nextDouble();
            ShippedOrder shipped = new ShippedOrder(cusNum, itemDes, quant, price);
    
            System.out.println("\nDisplaying Order Details");
            order.display();
    
            System.out.println("\nDisplaying Shipped Order Details");
            shipped.display();

        } catch (InputMismatchException e){
            System.out.println(DataMessages.errorMsg[0]);
        } catch (DataException e){
            System.out.println(e.getMessage());}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
