import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // add characters to set
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        // build result string
        String result = "";

        for (char ch : set) {
            result = result + ch;
        }

        System.out.println("Original: " + str);
        System.out.println("Result: " + result);
    }
}

// Set = duplicates இல்லாத box   //
// LinkedHashSet = order-யும் maintain பண்ணும் box//
