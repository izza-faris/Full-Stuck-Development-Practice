import java.util.Scanner;

public class Marks {
     public static void main(String[] args) {

        Scanner izza = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = izza.nextInt();

        if(marks >=75){
            System.out.println("Grade: A");
         } else if(marks >=65){
            System.out.println("Grade: B");         
         } else if(marks >=55){        
            System.out.println("Grade: C");
         } else if (marks >=35){
            System.out.println("Grade: S");
         } else {
            System.out.println("Fail");
         }
        izza.close();
    }
}
