import java.util.*;
public class Rectangle{
    int lenght;
    int width;

    void calculateArea(){
        int area = lenght * width;
        System.out.println("Area of rectangle: " + area);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of rectangle: ");
        int width = sc.nextInt();

        Rectangle myObj = new Rectangle();
        myObj.calculateArea();
    }
}