public class Car{
    String brand = "Range Rover";
    String color = "Black";
    int price = 5000000;

    public static void main(String[] args){
        Car myObj = new Car();
        System.out.println(myObj.brand);
        System.out.println(myObj.color);
        System.out.println(myObj.price);
    }
}