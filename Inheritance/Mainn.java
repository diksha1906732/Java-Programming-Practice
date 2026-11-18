class Shape {

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    double radius;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Mainn {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.radius = 5;

        c.display();
        c.calculateArea();

        System.out.println();

        Rectangle r = new Rectangle();

        r.length = 10;
        r.width = 5;

        r.display();
        r.calculateArea();
    }
}