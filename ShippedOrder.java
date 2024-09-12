public class ShippedOrder extends Order{
    private double handlingCharge = 228.0;

    public ShippedOrder (int cusNum, String itemDes, int quant, double price) {
        super(cusNum, itemDes, quant, price);
    }

    @Override
    public void display(){ 
        super.computationTotal();
        super.display();
        System.out.println("Shipping and Handling Charge: " + (super.computationTotal() + handlingCharge));
    }
}
