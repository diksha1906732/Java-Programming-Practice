/*import java.util.*;
public class Mini{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1, num2, choice;
        System.out.print("Enter first number:");
        num1 = sc.nextInt();
        System.out.print("Enter Second number:");
        num2 = sc.nextInt();

        do{
            System.out.println("Calculator Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    int sum = num1 + num2;
                    System.out.print("Sum:" + sum);
                    break;
                case 2:
                    int Sab = num1 - num2;
                    System.out.print("Substraction:" + Sab);
                    break;
                case 3:
                    int mul = num1 * num2;
                    System.out.print("Multiplication:" + mul);
                    break;
                case 4:
                    int div = num1 / num2;
                    System.out.print("Division:" + div);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
        while(choice != 5);
    }
}*/
/*
import java.util.*;
public class Mini{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] subjects = {"Maths", "Science", "English", "History", "Geography"};

        System.out.print("Enter Student name:");
        String name = sc.nextLine();

        System.out.print("Enter Student Roll number:");
        int rollNo = sc.nextInt();

        int sub1, sub2, sub3, sub4, sub5;
        System.out.println("Enter sub1 marks:");
        sub1 = sc.nextInt();
        System.out.println("Enter sub2 marks:");
        sub2 = sc.nextInt();
        System.out.println("Enter sub3 marks:");
        sub3 = sc.nextInt();
        System.out.println("Enter sub4 marks:");
        sub4 = sc.nextInt();
        System.out.println("Enter sub5 marks:");
        sub5 = sc.nextInt();

        System.out.print("\nStudent Details\n");
        System.out.println("Name:" + name);
        System.out.println("Roll Number:" + rollNo);

        System.out.println("Marks in sub1:" + sub1);
        System.out.println("Marks in sub2:" + sub2);
        System.out.println("Marks in sub3:" + sub3);
        System.out.println("Marks in sub4:" + sub4);
        System.out.println("Marks in sub5:" + sub5);

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total Marks:" + total);
        System.out.println("Percentage:" + (total/5) + "%");

        if(total >= 90){
            System.out.println("Grade:A");
        }
        else if(total >= 80){
            System.out.println("Grade:B");
        }
        else if(total >= 70){
            System.out.println("Grade:C");
        }
        else if(total >= 60){
            System.out.println("Grade:D");
        }
        else{
            System.out.println("Grade:F");
        }

    }
}*/

public class Mini{

    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        int avg = average(10,20,30);
        System.out.print(avg);
    }
}