import java.util.*;
public class Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of square:");
        int side = sc.nextInt();

        int s = side * side;

        System.out.print("Square of side :" +s);

    }
}