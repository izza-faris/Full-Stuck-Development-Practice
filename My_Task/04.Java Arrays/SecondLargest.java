public class SecondLargest {
    public static void main(String[] args){

        int [] arr ={45,78,56,89,91};

        int largest=arr[0];
        int secondlargest =arr [0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){                 //78 > 45
                secondlargest=largest;            //45 = 45
                largest = arr[i];                    //78 = 78
                                                 
            }else if (arr[i] > secondlargest && arr[i]!=largest ) {
                
            }
        }
        System.out.println("second largest: " + secondlargest);
    }
}
