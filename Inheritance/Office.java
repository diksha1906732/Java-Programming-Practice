/*3. Create an Employee class with employee ID and name. Create a Manager class that inherits Employee and adds department.*/

class Employee{
    int employeeID;
    String name;

    void displayEmployee(){
        System.out.println("Employee ID:" +employeeID);
        System.out.println("Name:" +name);
    }
}
class Manager extends Employee{
    String department;

    void displayManager(){
        displayEmployee();
        System.out.println("Department:" +department);

    }
}
public class Office{
    public static void main(String[] args){

        Manager m = new Manager();

        m.employeeID= 101;
        m.name = "Diksha";
        m.department = "Development";

        m.displayManager();

    }
}