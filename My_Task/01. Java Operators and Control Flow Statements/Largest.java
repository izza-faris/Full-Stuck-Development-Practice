
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner izza = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int a = izza.nextInt();
        int b = izza.nextInt();

        if(a>b){
            System.out.println(a + " is the largest number.");
        } else if(b>a){
            System.out.println(b + " is the largest number.");
        } 

       
        izza.close();

      


}
}