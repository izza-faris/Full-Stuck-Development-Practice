public class StringPalindrom {
    public static void main(String[] args){
      
        String str = "madam";
        String  word= "";

        for(int i=str.length()-1; i>=0; i-- ){
           word = word + str.charAt(i);
        }
        if(str.equals(word)){
          System.out.println("Palindrome String");
        }else{
             System.out.println("not Palindrome String");
        }




    }
}
