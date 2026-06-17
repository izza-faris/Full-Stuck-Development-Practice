import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner izza = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = izza.nextInt();
        
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }
        izza.close();
    }
}
