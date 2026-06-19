import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int num = input.nextInt();

        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }

        System.out.println("Number of digits = " + count);

        input.close();
    }

}