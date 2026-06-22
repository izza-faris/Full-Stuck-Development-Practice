   public class LargestElement{
    
    public static void main(String[]args){

        int [] lar = {70,45,67,89,98};

        int largest= lar[0];

        for(int i=1; i < lar.length; i++){
           if (lar[i] > largest){
            largest = lar[i];
           }

        }
         System.out.println("Largest element is: " + largest);
        }



    }

