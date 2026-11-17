public class Patient {

    String patientName;
    int patientId;
    int age;
    String disease;
    double consultationFee;
    double discount;
    double finalBill;

    void displayPatientDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Consultation Fee: " + consultationFee);
    }

    void calculateBill() {
        finalBill = consultationFee;
    }

    void applyDiscount() {
        if (age > 60) {
            discount = consultationFee * 10 / 100;
            finalBill = consultationFee - discount;
        }
    }

    void displayFinalBill() {
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);
    }

    public static void main(String[] args) {

        Patient p1 = new Patient();

        p1.patientName = "Rahul";
        p1.patientId = 101;
        p1.age = 65;
        p1.disease = "Fever";
        p1.consultationFee = 500;

        p1.displayPatientDetails();
        p1.calculateBill();
        p1.applyDiscount();
        p1.displayFinalBill();
    }
}