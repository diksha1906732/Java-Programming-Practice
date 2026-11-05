import java.util.*;

public class User{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PRice of Pencil:");
        float pencil = sc.nextFloat();
        System.out.print("Enter PRice of Pen:");
        float pen = sc.nextFloat();
        System.out.print("Enter PRice of eraser:");
        float eraser = sc.nextFloat();


        float total = pencil + pen + eraser;
        float gst = total * 18 / 100; 
        float finalAmount = total + gst;


        System.out.print("Total cost:" + total);
        System.out.println("GST amount:" + gst);
        System.out.print("Final Amount:" + finalAmount);
    }
}