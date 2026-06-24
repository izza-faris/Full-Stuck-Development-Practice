
public class LargestElementArray{
    public static void main(String[] args){
        
        int[] arr = {47,89,67,90,59};

        int largest= arr[0];

       for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
             largest = arr[i];

            }
        }
        System.out.println("Largest Element is: " + largest);

    }
}
