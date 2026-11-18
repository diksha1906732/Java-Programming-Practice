/*Create multilevel inheritance: Vehicle → Car → ElectricCar.*/

class Vehicle {

    String brand;
    int speed;

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {

    String fuelType;

    void displayCar() {
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {

    int batteryCapacity;

    void displayElectricCar() {
        displayVehicle();
        displayCar();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Transport {

    public static void main(String[] args) {

        ElectricCar e1 = new ElectricCar();

        e1.brand = "Tata";
        e1.speed = 150;
        e1.fuelType = "Electric";
        e1.batteryCapacity = 60;

        e1.displayElectricCar();
    }
}