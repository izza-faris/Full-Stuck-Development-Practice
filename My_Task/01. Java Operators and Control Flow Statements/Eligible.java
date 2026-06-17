import java.util.Scanner;

public class Eligible { 
    public static void main(String[] args){

        Scanner izza= new Scanner(System.in);
        System.out.println("Enter your age: ");
        
        int age = izza.nextInt();
        
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        izza.close();
    }
    
}
