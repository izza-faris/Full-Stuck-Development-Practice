import java.util.Scanner;
public class DayNames {
    public static void main(String[] args){

        Scanner izza = new Scanner(System.in);
        System.out.print("Enter a number between 1 - 7 to see Days: ");
        int day = izza.nextInt();

        switch(day){
                case 1:
                System.out.println("Monday");
                break;

                case 2:
                System.out.println("Tuesday");
                break;

                case 3:
                System.out.println("Wednesday");
                break;

                case 4:
                System.out.println("Thursday");
                break;

                case 5:
                System.out.println("Friday");
                break;

                case 6:
                System.out.println("Saturday");
                break;

                case 7:
                System.out.println("Sunday");
                break;
                default:
                System.out.println("Invalid input! Please enter a number between 1 to 7.");



            


        }
        izza.close();

       
    }
}
