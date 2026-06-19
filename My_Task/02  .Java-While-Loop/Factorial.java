import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int fact = 1;

        while (num > 0) {
            fact = fact * num;
            num--;
        }

        System.out.println("Factorial = " + fact);

         input.close();
    }
}