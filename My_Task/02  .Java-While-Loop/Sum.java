import java.util.Scanner;
public class Sum {
    public static void main (String[] args){
   
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");

    int n = input.nextInt();
    
    int i=2;
    int sum=0;

    while(i<=n){
         sum = sum+i;
         i= i+2;
        
        }

    System.out.println("Sum of even numbers = " + sum);




 input.close();



    }
}
