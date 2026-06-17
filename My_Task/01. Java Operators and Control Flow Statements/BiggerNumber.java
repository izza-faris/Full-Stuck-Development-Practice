import java.util.Scanner;
public class BiggerNumber {
    public static void main(String[] args) {
      
        Scanner izza = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        int num1 = izza.nextInt();

        System.out.println("Enter the second number: ");

        int num2 = izza.nextInt();
         
        if(num1 > num2) {
            System.out.println("The bigger number is: " + num1);
        } else if(num2 > num1) {
            System.out.println("The bigger number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
        izza.close();

    }
}
