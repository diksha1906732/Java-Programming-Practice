class Payment {
    private int paymentId;
    private double amount;
    private String paymentStatus;

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
            paymentStatus = "Pending";
        } else {
            System.out.println("Invalid amount! Payment amount must be positive.");
        }
    }

    public void makePayment() {
        if (amount > 0 && paymentStatus.equals("Pending")) {
            paymentStatus = "Successful";
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment cannot be processed.");
        }
    }

    public void refundPayment() {
        if (paymentStatus.equals("Successful")) {
            paymentStatus = "Refunded";
            System.out.println("Refund successful!");
        } else {
            System.out.println("Refund cannot be processed.");
        }
    }

    public void displayPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Payment Status: " + paymentStatus);
    }
}

public class Shopping{
    public static void main(String[] args) {
        Payment p1 = new Payment();

        p1.setPaymentId(101);
        p1.setAmount(1500);

        p1.makePayment();
        p1.displayPaymentDetails();

        p1.refundPayment();
        p1.displayPaymentDetails();
    }
}