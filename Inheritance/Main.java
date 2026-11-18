class Person{
    String name;
    int age;

    void displayPerson(){
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
    }
}
class Student extends Person{
    int rollNo;

    void displayStudent(){
        displayPerson();
        System.out.println("Roll no:" +rollNo);
    }
}
public class Main{
    public static void main(String[] args){

        Student s1 = new Student();

        s1.name = "Diksha";
        s1.age = 21;
        s1.rollNo = 74;

        
        s1.displayStudent();

    }
}