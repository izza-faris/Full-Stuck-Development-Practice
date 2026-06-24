public class ReverseAnArray{
    public static void main(String[] args){
     
        int [] reverse= {10,20,30,40,50};

       int start= 0;
       int end = reverse.length-1;

       while (start<end) {
            int a= reverse[start];
            reverse[start]= reverse[end];
            reverse[end]= a;

             start++;
             end--;
        
       }


        for(int i=0; i<reverse.length; i++ ){
        System.out.println(reverse[i] + " ");
        }

    }
}
