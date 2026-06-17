 
 import java.util.Scanner;


   public class Operator{

public static void main(String[]args){

  Scanner izza = new Scanner(System.in);
  System.out.println("Enter two numbers: ");
   int a = izza.nextInt();
   int b = izza.nextInt();
   System.out.println("The sum is: " + (a + b));
   System.out.println("The Difference is: " + (a - b));
   System.out.println("The Product is: " + (a * b));
   System.out.println("The Quotient is: " + (a / b));

   izza.close();
}
   } 
    

