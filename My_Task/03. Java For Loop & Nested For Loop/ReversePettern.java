public class ReversePettern {
    public static void main(String[] args){
     
        for (int i = 5; i >= 1; i--) {                   //Outer Loop (i) = எத்தனை row (line) print ஆகணும்//

    for (int j = 1; j <= i; j++) {                       //Inner Loop (j) = அந்த row-ல் எத்தனை * print ஆகணும்//
        System.out.print("*");
    }

    System.out.println();
}

    }
    
}
