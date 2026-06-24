public class SecondLargest {
    public static void main(String[] args){

        int [] arr ={45,36,56,89,91};

        int largest=arr[0];
        int secondlargest =arr [0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){                 
                secondlargest=largest;            
                largest = arr[i];                    
                                                 
            }else if (arr[i] > secondlargest && arr[i]!=largest ) {
                
            }
        }
        System.out.println("second largest: " + secondlargest);
    }
}
