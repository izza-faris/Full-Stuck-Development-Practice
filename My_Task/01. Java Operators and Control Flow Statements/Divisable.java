import java.util.Scanner;


public class Divisable {
    public static void main(String[] args){
        Scanner izza = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num =izza.nextInt();
        
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println(num + " is divisable by both 3 and 5.");
        }else if(num % 3 == 0){
            System.out.println(num + " is divisable by 3.");
        } else if(num % 5 == 0){
            System.out.println(num + " is divisable by 5.");
        } else{
            System.out.println(num + " is not divisable by either 3 or 5.");
        }

       izza.close();

    }
  
}
