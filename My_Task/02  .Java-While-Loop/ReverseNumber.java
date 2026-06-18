import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;              // get last digit
            reverse = reverse * 10 + digit;    // add digit to reverse
            num = num / 10;                   // remove last digit
        }

        System.out.println("Reversed number = " + reverse);

        input.close();
    }
}