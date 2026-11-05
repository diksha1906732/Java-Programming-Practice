//input 3 numbers, A B C fine average of three number and print output
import java.util.*;
public class Avg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A:");
        int A = sc.nextInt();
        System.out.print("Enter B:");
        int B = sc.nextInt();
        System.out.print("Enter C:");
        int C = sc.nextInt();
        

        int sum = A+B+C;

        int avg = sum/3;

        System.out.println("Average is: " + avg);
    }
}