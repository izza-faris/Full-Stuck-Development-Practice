public class SmallestElementArray {
    public static void main(String[] args){

        int [] arr = {34,29,43,19,5};

        int smallest = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest=arr[i];
            }
        }
      System.out.println("Smallest element is: " + smallest);
    }
}
