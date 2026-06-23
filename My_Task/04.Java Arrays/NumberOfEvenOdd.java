public class NumberOfEvenOdd {
     
     public static void main(String[] args){
       
        int [] num ={10,3,6,5,7};

        int evencount=0;
        int oddcount=0;
         
        for(int i=0; i<num.length; i++){
            if(num[i]%2==0){
               evencount++;
            }else{
                oddcount++;
            }
        }
         System.out.println("even count: " + evencount);
         System.out.println("odd count: " + oddcount);
     }

}
