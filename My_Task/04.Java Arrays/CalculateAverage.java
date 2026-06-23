import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[] args){
       Scanner input= new Scanner(System.in);

       System.out.println("Enter array size: ");
       int size = input.nextInt();

       int[] arr = new int[size];

       System.out.println("Enter array element: ");

       int sum=0;

       for(int i=0; i<size; i++){
        arr[i]=input.nextInt();
        sum = sum +  arr[i];
       }
       double average = (double) sum / size; 

       System.out.println("Average of array element: " + average);

       input.close();   

    }

}
