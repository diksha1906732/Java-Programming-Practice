public class ElectricityBill{
    String customerName = "Diksha Patil";
    int unitsConsumed = 100;
    double ratePerUnit = 5.0;

    void calculateBill(){
        double totalBill = unitsConsumed * ratePerUnit;
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Rate per Unit: " + ratePerUnit);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args){
        ElectricityBill bill = new ElectricityBill();
        bill.calculateBill();
    }
}