public class StringsRearrangement {
    //Given an array of equal-length strings, you'd like to know
    // if it's possible to rearrange the order of the elements
    // in such a way that each consecutive pair of strings differ
    // by exactly one character. Return true if it's possible, and false if not.
    //Note: You're only rearranging the order of the strings, not the order of the letters within the strings!
    boolean stringsRearrangement(String[] inputArray) {

        boolean[] used = new boolean[inputArray.length];
        findSequence(inputArray, null, used, 0);

        return success;
    }

    boolean success = false;

    void findSequence(String[] a, String prev, boolean[] used, int n) {

        if (n == a.length) {
            success = true;
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (!used[i] && (prev == null || differByOne(prev, a[i]))) {
                used[i] = true;
                findSequence(a, a[i], used, n+1);
                used[i] = false;
            }
        }
    }

    boolean differByOne(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}
