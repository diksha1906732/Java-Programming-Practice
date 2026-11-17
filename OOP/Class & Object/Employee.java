public class Employee{
    String employeeName = "Diksha Patil";
    String employeeId = "101";
    int salary = 500000;

    public static void main(String[] args){
        Employee myObj = new Employee();
        System.out.println(myObj.employeeName);
        System.out.println(myObj.employeeId);
        System.out.println(myObj.salary);
    }
}