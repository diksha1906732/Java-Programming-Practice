public class Employe {

    String name = "Diksha";
    double salary = 25000;
    double bonus = 5000;

    void calculateSalary() {

        double totalSalary = salary + bonus;

        System.out.println("Employe: " + name);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {

        Employe e1 = new Employe();

        e1.calculateSalary();
    }
}