public class RightRotateOne {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int last = arr[arr.length - 1];  // store last element

        // shift elements to right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // put last element in first position

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
