import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
        
       try {
        
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();

        int result= num1/num2;
        System.out.println("Result = " + result);
        
        } catch (ArithmeticException e) {
            System.out.println("Cannot devide by zero");
        }
         catch(InputMismatchException i){
                 System.out.println("Error: Invalid input. Please enter integers only.");
        }
        finally{
            System.out.println("Program execution completed");
        }
        
    
        input.close();
    }
    
}
    

