class Student{
    private String name;
    private int rollNo;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
}

public class Main{
    public static void main(String[] args){

         Student s1 = new Student();

        s1.setName("Diksha");
        s1.setRollNo(101);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNo());



    }
}