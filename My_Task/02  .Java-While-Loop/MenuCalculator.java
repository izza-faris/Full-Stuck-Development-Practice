import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                int num1 = input.nextInt();

                System.out.print("Enter second number: ");
                int num2 = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (num1 + num2));
                        break;

                    case 2:
                        System.out.println("Result = " + (num1 - num2));
                        break;

                    case 3:
                        System.out.println("Result = " + (num1 * num2));
                        break;

                    case 4:
                        System.out.println("Result = " + (num1 / num2));
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Calculator Closed!");
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        input.close();
    }
}