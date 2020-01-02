public class AlphabeticShift {
    //Given a string, your task is to replace each of its characters
    // by the next one in the English alphabet; i.e. replace a with b,
    // replace b with c, etc (z would be replaced by a).
    String alphabeticShift(String inputString) {

        char[] arr = inputString.toCharArray();

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 'z')
                arr[i] = 'a';
            else
                arr[i] = (char)(arr[i] + 1);
        }
        return new String(arr);
    }

}
