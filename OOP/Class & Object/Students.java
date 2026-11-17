public class Students {

    String name;
    int rollNumber;

    int m1, m2, m3, m4, m5;

    int total;
    double percentage;
    String grade;

    void calculateTotal() {

        total = m1 + m2 + m3 + m4 + m5;
    }

    void calculatePercentage() {

        percentage = (total * 100.0) / 500;
    }

    void calculateGrade() {

        if (percentage >= 90 && percentage <= 100) {
            grade = "A";
        }
        else if (percentage >= 75) {
            grade = "B";
        }
        else if (percentage >= 60) {
            grade = "C";
        }
        else if (percentage >= 40) {
            grade = "D";
        }
        else {
            grade = "Fail";
        }
    }

    void displayResult() {

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);

        System.out.println("M1: " + m1);
        System.out.println("M2: " + m2);
        System.out.println("M3: " + m3);
        System.out.println("M4: " + m4);
        System.out.println("M5: " + m5);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        Students s1 = new Students();

        s1.name = "Diksha";
        s1.rollNumber = 101;

        s1.m1 = 90;
        s1.m2 = 98;
        s1.m3 = 99;
        s1.m4 = 89;
        s1.m5 = 70;

        s1.calculateTotal();
        s1.calculatePercentage();
        s1.calculateGrade();

        s1.displayResult();
    }
}