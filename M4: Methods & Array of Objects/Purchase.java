public class Purchase {
    private int invoice;
    private double sale_amt;
    private double sale_tax;

    public void setInvoiceNumber(int x){
        invoice = x;
    }

    public int getInvoiceNumber(){
        return invoice;
    }

    public void setSaleAmount(double x){
        //x = sale_amt - (sale_amt * 0.08);
        sale_amt = x;
    }
    public double getSaleAmount(){
        return sale_amt;
    }
    
    public double getSaleTax(){
        sale_tax = sale_amt * 0.08;
        return sale_tax;
    }

}
