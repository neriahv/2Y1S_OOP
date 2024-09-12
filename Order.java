public class Order {
    private int cusNum;
    private String itemDes;
    private int quant;
    private double price;
    private double total;

    public Order (int cusNum, String itemDes, int quant, double price){
        this.cusNum = cusNum;
        this.itemDes = itemDes;
        this.quant = quant;
        this.price = price;
    }

    public double computationTotal () {
        total = quant * price;
        return total;
    }

    public void display () {
        System.out.println("Customer Details");
        System.out.println("Customer Number: " + cusNum);
        System.out.println("Item Description: " + itemDes);
        System.out.println("Quantity: " + quant);
        System.out.println("Item Price: " + price);
        System.out.println("Total Price: " + total);
    }
}
