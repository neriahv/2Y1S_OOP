import java.util.Scanner;

public class Transaction{
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        Purchase[] purchases = new Purchase[3];
        
        
        for (int i=0; i< purchases.length; i++){
            purchases[i] = new Purchase();
            System.out.println("Enter details for Purchase " + (i+1) + ":");
            int invoice_num = purchases[i].getInvoiceNumber();
            while (true){
                System.out.print("Enter the invoice number (between 1001 and 8000): "); invoice_num = input.nextInt();
                if (invoice_num >= 1001 && invoice_num <= 8000){
                    break; }
            }
            purchases[i].setInvoiceNumber(invoice_num);
            double sale_amount = 0;
            System.out.print("Enter sale amount (positive value): P "); sale_amount = input.nextDouble();  
            while (true){
                if (sale_amount >= 1){
                    break;
                } else {
                    System.out.print("Enter sale amount (positive value): P "); sale_amount = input.nextInt();
                }
            }
            purchases[i].setSaleAmount(sale_amount);
        }
        
        input.nextLine();
        System.out.print("Enter the name of the checker: "); String checker = input.nextLine(); 

        double TOTALsale = computePurchases(purchases);
        computePurchases(purchases, checker, TOTALsale);
    }

    public static double computePurchases (Purchase[] purchases){
        double total_sale = 0;
        for (int i = 0; i < purchases.length; i++){
            total_sale = total_sale + purchases[i].getSaleAmount();
        }
        return total_sale;
    }

    public static void computePurchases (Purchase[] purchases, String checker, double TOTALsale){
        double total_tax = 0;
        System.out.println("Purchases Details: ");
        for (int i=0; i<purchases.length; i++){
            System.out.println("\tInvoice number: " + purchases[i].getInvoiceNumber());
            System.out.println("\tSale Amount: P " + purchases[i].getSaleAmount());
            System.out.println("\tSale Tax Amount: P " + purchases[i].getSaleTax());
            total_tax = total_tax + purchases[i].getSaleTax();
        }

        System.out.println("Total Amount Purchased: P" + TOTALsale);
        System.out.println("Total Tax: P " + total_tax);

        System.out.println("Checked by: " + checker);
    }

}