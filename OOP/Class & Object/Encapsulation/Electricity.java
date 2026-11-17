class ElectricityBill {
    private String customerName;
    private double units;
    private double ratePerUnit;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUnits(double units) {
        if (units >= 0) {
            this.units = units;
        } else {
            System.out.println("Invalid units! Units cannot be negative.");
        }
    }

    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    public double calculateBill() {
        return units * ratePerUnit;
    }

    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Rate Per Unit: " + ratePerUnit);
        System.out.println("Total Electricity Bill: ₹" + calculateBill());
    }
}

public class Electricity{
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();

        bill.setCustomerName("Diksha");
        bill.setUnits(150);
        bill.setRatePerUnit(5.5);

        bill.displayBill();
    }
}