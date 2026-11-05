/*public class Basic{
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}*/

/*public class Basic{
    public static void main(String[] args){
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
    }

}*/

/*public class Basic{
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

}*/

/*public class Basic{
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            
            if (i%2 == 1){
                System.out.println(i);
            }
        }
    }

}*/

/*public class Basic{
    public static void main(String[] args){
        int num = 5;
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
            
        }
    }
}*/

/*import java.util.*;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
            
        }
    }
}*/

/*import java.util.*;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println(i);
            
        }
    }
}*/

/*import java.util.*;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = sc.nextInt();
        int sum =0;
        for(int i=1; i<=num; i++){

            if(i%2 == 0){
                sum= sum+(2*i);
            }
            
        }
        System.out.println("Sum of even numbers:" + sum);
    }
}*/

/*import java.util.*;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = sc.nextInt();
        int sum =0;
        for(int i=1; i<=num; i++){
                sum= sum+(2*i-1);
            
        }
        System.out.println("Sum of odd numbers:" + sum);
    }
}*/

/*public class Basic{
    public static void main(String[] args){
        int num = 1;
        while(num<=5){
            System.out.println(num);
            num++;
        }
    }
}*/

/*public class Basic{
    public static void main(String[] args){
        int num = 20;
        while(num>=1){
            System.out.println(num);
            num--;
        }
    }
}*/
/*import java.util.*;
public class Basic{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int sum=0;

        while(num>=1){
            sum= sum+num;
            num--;
        }

        System.out.print("Sum of N numbers:" + sum);
    }
}*/

/*import java.util.*;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();

        int count = 0;

        while(num!=0){
            count++;
            num = num/10;
        }

        System.out.println("Number of didgits:" + count);
    }
}*/

/*public class Basic{
    public static void main(String[] args){

        int num = 12345;
        int sum =0;

        while(num!=0){
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.print("Sum:" + sum);
    }
}
*/

/*public class Basic{
    public static void main(String[] args){

        int num = 12345;
        int reverse = 0;

        while(num!=0){
            int digit = num % 10;
            reverse = reverse *10 + digit;
            num = num/10;
        }
        System.out.print("Reverse:" + reverse);
    }
}*/

/*public class Basic{
    public static void main(String[] args){

        int num = 121;
        int original = num;
        int reverse = 0;

        while(num!=0){
            int digit = num % 10;
            reverse = reverse *10 + digit;
            num = num/10;
        }
        System.out.print("Reverse:" + reverse);
        if (original == reverse){
            System.out.print("Palindrom");
        }
        else{
            System.out.print("Not palindrom");
        }
    }
}
*/






