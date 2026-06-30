
 import java.util.Scanner;

class number{
   void  CheckNumber(int num) throws Exception{

    if (num<0){
       throw new Exception("Negative number is not allowed");

    }
    System.out.println("The number is positive");
   }

    }


    public class Throws {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       

        System.out.println("Enter a number");
        int num=input.nextInt();

         number obj= new number();

        try {
           obj.CheckNumber(num); 


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

       input.close();

    }
}
