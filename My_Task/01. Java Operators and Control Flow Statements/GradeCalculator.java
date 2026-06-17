import java.util.Scanner;
public class GradeCalculator{
 public static void main(String[] args){
    
    Scanner izza = new Scanner(System.in);
    System.out.print("Enter your score: ");
    int score = izza.nextInt();
    
    if(score>=90){
        System.out.println( "Your grade is A.");
    }else if(score>=80){
        System.out.println( "Your grade is B.");
    }else if(score>=70){
        System.out.println( "Your grade is C.");
    }else if(score>=60){
        System.out.println( "Your grade is D.");
    } else{
        System.out.println( "Your grade is F.");
    }
    izza.close();

 }

}




/* This program calculates the grade based on the score entered by the user. 
 * It uses if-else statements to determine the grade according to the following criteria:
 * - A: 90 and above
 * - B: 80 to 89
 * - C: 70 to 79
 * - D: 60 to 69
 * - F: Below 60
 */