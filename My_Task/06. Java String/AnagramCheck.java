import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Step 1: remove spaces and convert to lowercase (optional but good practice)
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Step 2: length check
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Step 3: convert to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Step 4: sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 5: compare
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
