import java.util.Scanner;
public class CalculateSum {
    public static void main(String[] args){
       
        Scanner input= new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size=input.nextInt();

        int[] arr= new int[size];
        
        System.out.println("Enter Array Elements");

        for(int i=0; i< size; i++){
            arr[i]=input.nextInt();
        }

        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum= sum+arr[i];
        }

        System.out.println("Sum = " + sum);


      input.close();  

       

    }

}
