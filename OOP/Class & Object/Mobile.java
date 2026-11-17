import java.util.*;
public class Mobile{

    String brand;
    String model;
    double price;
    String battery;

    void displayDetails(){
        System.out.println("Brand:" +brand);
       
        System.out.println("Model:" +model);
        
        System.out.println("Price:" +price);
        
        System.out.println("Battery:" +battery);
        
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Mobile m = new Mobile();
        
        System.out.print("Enter Brand: ");
        m.brand = sc.nextLine();

        System.out.print("Enter Model: ");
        m.model = sc.nextLine();

        System.out.print("Enter Price: ");
        m.price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Battery: ");
        m.battery = sc.nextLine();

       
        System.out.println("\nMobile Details:");

       
        m.displayDetails();
    }
}
