public class CountEvenOdd {
    public static void main(String[] args){
          
        int [] arr= {9,16,11,20,3};

        int evencount =0;
        int oddcount =0;

        for(int i=0; i< arr.length; i++){
          if(arr[i] %2 == 0){
             evencount++;
          }else{
           oddcount++;
          }

        }
        System.out.println("even count: " + evencount);
        System.out.println("odd count: " +  oddcount);
    }
}
