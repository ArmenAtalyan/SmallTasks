public class CheckPalindrome {
    boolean checkPalindrome(String inputString) {
        boolean palindrom = false;

        if(inputString.length() == 1){
            palindrom = true;
        }

        for(int i = 0, j = inputString.length() - 1; i < j; i++, j--){
            if(inputString.charAt(i) == inputString.charAt(j))
                palindrom = true;
            else
                palindrom = false;
        }
        return palindrom;
    }
}
