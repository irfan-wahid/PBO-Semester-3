
public class Commision extends Hourly{
    private double total_sales;
    private double commisionRate;
    
    
    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commisionRate = comRate;
    }  
    
    public void addSales(double totalSales){
        total_sales = totalSales; 
    }
    
    @Override
    public double pay(){
        double payment = super.pay() + (total_sales * commisionRate);
        return payment;
    }
    
    public String toString(){
        String result = super.toString();

        result += "\npayment: " + total_sales;

        return result;
    }
}
