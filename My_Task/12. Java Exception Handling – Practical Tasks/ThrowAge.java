import java.util.Scanner;

public class ThrowAge {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

            try {
            System.out.println("Enter Student Age");
             int age = input.nextInt();
        
            if (age<18) {
                throw new IllegalArgumentException ("Student age must be 18 or above.");
            }
               
            System.out.println("Student is eligible");

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

         input.close();
    }
   
}
