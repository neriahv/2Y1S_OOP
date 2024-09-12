import java.util.*;
public class UseOrder {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws DataException_Garcia{
        Order a = new Order();
        ShippedOrder b = new ShippedOrder();

        lobbyScreen();
        
        try {
            System.out.println("Enter Order Details: "); 
            //Customer Number
            System.out.print("Enter Customer number: "); int custumerNumInput = input.nextInt();
            a.setCustomerNumber(custumerNumInput);
            input.nextLine();//Consumes leftover newline
            validateInput(custumerNumInput, 0, 0);

            //Item description
            System.out.print("Item description: ");  String itemDescriptionInput = input.nextLine();
            a.setItemDesc(itemDescriptionInput);

            //Quantity Order
            System.out.print("Enter quantity: ");
            int quantityInput = input.nextInt();
            a.setQuantityOrder(quantityInput);
            validateInput(custumerNumInput, quantityInput, 0);

            //Unit Price
            System.out.print("Enter price: ");
            float unitPriceInput = input.nextFloat();
            a.setUnitPrice(unitPriceInput);
            validateInput(custumerNumInput, quantityInput, unitPriceInput);

            //ShippedOrder Details

            System.out.println("Enter ShippedOrder Details: "); 
            //Customer Number
            System.out.print("Enter Customer number: ");
            int custumerNumInputShipped = input.nextInt();
            b.setCustomerNumber(custumerNumInputShipped);
            input.nextLine();//Consumes leftover newline

            //Item description
            System.out.print("Item description: ");
            String itemDescriptionInputShipped = input.nextLine();
            b.setItemDesc(itemDescriptionInputShipped);

            //Quantity Order
            System.out.print("Enter quantity: ");
            int quantityInputShipped = input.nextInt();
            b.setQuantityOrder(quantityInputShipped);

            //Unit Price
            System.out.print("Enter price: ");
            float unitPriceInputShipped = input.nextFloat();
            b.setUnitPrice(unitPriceInputShipped);

            //Compute for the total price with Object class
            a.computeTotalPrice(quantityInput, unitPriceInput);
            System.out.println();
            System.out.println("Display Order Details: ");
            a.displayValues(); //Display output

            //Compute for the total price with Shipping Shipped Order class
            b.computeTotalPrice(quantityInputShipped, unitPriceInputShipped);
            System.out.println();
            System.out.println("Display ShippedOrder Details: ");
            b.displayValues();//Display output

        } catch(DataException_Garcia e) {
            System.out.println(e.getMessage());
        } catch(InputMismatchException e){
            throw new DataException_Garcia(DataMessages_Garcia.errorMessage[0]);
        }
        
    }
    public static void validateInput(int customerNum, int quant, float price) throws DataException_Garcia{
        if (customerNum < 1000){
            throw new DataException_Garcia(DataMessages_Garcia.errorMessage[1]);
        }
        if (customerNum > 5000){
            throw new DataException_Garcia(DataMessages_Garcia.errorMessage[2]);
        }
        if (quant < 0){
            throw new DataException_Garcia(DataMessages_Garcia.errorMessage[3]);
        }
        if (price < 0){
            throw new DataException_Garcia(DataMessages_Garcia.errorMessage[4]);
        }
        if (price > 10000){
            throw new DataException_Garcia(DataMessages_Garcia.errorMessage[5]);
        }
    }
    public static void clearConsole() {
        System.out.println("\033[H\033[2J");
    }
    public static void lobbyScreen(){
        System.out.println("\t\tThis program lets you calculate your order and its shipped price.");
        System.out.print("\t\tPress [1] to Continue, [0] to Exit: "); int choice = input.nextInt();
        if(choice == 1){
            clearConsole();
        }
        if(choice == 0){
            System.exit(1);
        }
    }
  }
