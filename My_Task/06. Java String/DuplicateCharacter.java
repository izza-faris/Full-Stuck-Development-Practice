  public class DuplicateCharacter{
    public static void main(String[] args) {

        String str = "programming";
        char[] arr = str.toCharArray();
        boolean[] visited = new boolean[arr.length];

        System.out.println("Duplicate characters:");

        // Step 1: pick each character
        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            // Step 2: compare with remaining characters
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            // Step 3: print only duplicates
            if (count > 1) {
                System.out.println(arr[i] + " = " + count);
            }
        }
    }
}