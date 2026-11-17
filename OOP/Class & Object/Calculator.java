public class Calculator {

    int a = 10;
    int b = 10;

    void add(){
        System.out.println("Addition: " + (a + b));
    }
    void sub(){
        System.out.println("Subtraction: " + (a - b));
    }
    void mul(){
        System.out.println("Multiplication: " + (a * b));
    }
    void div(){
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args){
        Calculator obj = new Calculator();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }

}