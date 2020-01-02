public class LongestWord {
    //Define a word as a sequence of consecutive English letters. Find the longest word from the given string.
    String longestWord(String text) {

        char[] arr = text.toCharArray();
        String max = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if ('a'<=arr[i] && arr[i]<='z' || 'A'<=arr[i] && arr[i]<='Z') {
                sb.append(arr[i]);
                if (sb.length() > max.length())
                    max = sb.toString();
            }
            else {
                sb = new StringBuilder();
            }
        }
        return max;
    }
}
