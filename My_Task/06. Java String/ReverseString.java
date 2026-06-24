

public class ReverseString{
    public static void main(String[] args){

        String S = "Izza";
        String reverse= " ";

        for(int i= S.length()-1; i>=0;i--){

            reverse= reverse + S.charAt(i);
        }

        
      System.out.println("Orginal String is: " +S);
      System.out.println("Reverse String is: " +reverse);

    }
}
