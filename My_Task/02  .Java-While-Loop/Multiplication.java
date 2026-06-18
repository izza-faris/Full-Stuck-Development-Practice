import java.util.Scanner;
public class Multiplication{
    public static void main (String[] args){
   
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");

    int n = input.nextInt();
    
    int i=1;
    while(i<=12){
          System.out.println(n + "x" +i + "=" + (n * i));
          i++;
    }




 input.close();



    }
}
