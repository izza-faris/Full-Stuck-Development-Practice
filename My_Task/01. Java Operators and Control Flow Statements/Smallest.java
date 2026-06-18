import java.util.Scanner;


public class Smallest {
    public static void main(String[] args){
        Scanner izza = new Scanner(System.in);

        System.out.println("Enter three number: ");
        int a =izza.nextInt();
        int b =izza.nextInt();
        int c =izza.nextInt();
         
        if(a<b && a<c){
            System.out.println(a + " is a smallest number.");
        } else if(b<a && b<c){
            System.out.println(b + " is a smallest number.");
        } else if(c<a && c<b){
            System.out.println(c + " is a smallest number.");
        } else{
            System.out.println(" All numbers are equal.");
        }
    
     izza.close();
}
  
        
      

}
    
