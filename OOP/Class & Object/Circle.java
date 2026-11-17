import java.util.*;

public class Circle{

    int r;

    void calculateArea(){
        float area = 3.14f * r * r;
        System.out.println("Area:" +area);
    }
    void calculateCircumference(){
        float circumference = 2 * 3.14f * r;
        System.out.println("Circumference:" +circumference);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter radius:");
        c.r = sc.nextInt();

        c.calculateArea();
        c.calculateCircumference();


    }
}