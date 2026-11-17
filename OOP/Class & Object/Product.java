import java.util.*;

public class Product{

    String productName;
    int price;
    int quantity;
    int total;

    void calculateTotal(){
        total = quantity * price;
       
    }

    void displayBill(){
        System.out.println("PRoduct name:" +productName);
        System.out.println("Price:" +price);
        System.out.println("Quantity:" +quantity);
        System.out.println("Total Bill:" +total);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();

        p1.productName = "pen";
        p1.price = 10;
        p1.quantity = 10;

        p1.calculateTotal();
        p1.displayBill();


    }
}