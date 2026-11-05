/*import java.util.*;

public class Array{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum=0;

        System.out.println("Element of array:");
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
            sum = sum+arr[i];
        }
        System.out.println("Sum of array elements: " + sum);

        int avg = sum/arr.length;
        System.out.println("Average of array elements: " + avg);

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element in array:" + max);
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                max = arr[i];
            }
        }
        System.out.println("Smallest element in array:" + min);
        System.out.println("Length of arr:" + arr.length);

        System.out.println("Element of array in reverse order :");
        for(int i =arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
            
        }

        int evenCount = 0, oddCount =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even count:" + evenCount);
        System.out.println("Odd count:" + oddCount);

        int n;
        System.out.print("Enter elemnt to search:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i =0; i<arr.length; i++){
            if (arr[i] == n){
                System.out.print("Element found at index:" + i);
                break;
            }
        }
        System.out.println("Element not found");

    }
}*/
/*public class Array{
    public static void main(String[] array){
        int[] arr = {10, 20, 30, 40, 50};

        int countPositive =0, countNegative =0, countZero = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > 0){
                countPositive++;
            }
            else if(arr[i] < 0){
                countNegative++;
            }
            else{
                countZero++;
            }
        }
        System.out.println("Count of positive numbers:" + countPositive);
        System.out.println("Count of negative numbers:" + countNegative);
        System.out.println("Count of zeros:" + countZero);

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int merge = arr1 + arr2;
        System.out.println("Merged array:" + merge);

    }
}*/

public class Array{
    public static void main(String[] args){
        String str = "Computer";
        System.out.println("Length of string:" + str.length());

        String str1 = "python";
        String str2 = "JAVA";
        String str3 = "Programming";
        String str4 = "Hello";
        String str5 = "hello";
        String str6 = "Good";
        String str7 = "Java";
        String str8 = "I Love Java";
        String str9 = "I am learning Java";
        String str10 = "Java";
        String str11 = "Morning";

        System.out.println("Uppercase string:" + str1.toUpperCase());
        System.out.println("Uppercase string:" + str2.toLowerCase());
        System.out.println("Characer at index 0:" + str3.charAt(0));
        System.out.println("string:" + str4.equals(str5));
        System.out.println("Concat string:" + str6.concat(str11));
        System.out.println("Substring string:" + str8.substring(7,11));
        




    }
}