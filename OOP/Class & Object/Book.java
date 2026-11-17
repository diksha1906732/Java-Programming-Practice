import java.util.*;

public class Book{

    String title;
    String author;
    double price;

    void displayDetails(){
        System.out.println("Title:" +title);
        System.out.println("Author:" +author);
        System.out.println("Price:" +price);    
    }

    void applyDiscount() {

        double discount = price * 10 / 100;

        double finalPrice = price - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

       
        Book b1 = new Book();

        b1.title = "Java Programming";
        b1.author = "James Gosling";
        b1.price = 500;

        b1.displayDetails();

        b1.applyDiscount();


    }
}