import java.util.Scanner;


   public class Even{

public static void main(String[]args){

  Scanner izza = new Scanner(System.in);
  System.out.println("Enter a number: ");
  int num = izza.nextInt();

  if(num % 2 == 0){
      System.out.println(num + " is even.");
  } else {
      System.out.println(num + " is odd.");
  }

   izza.close();
}
   } 
    


