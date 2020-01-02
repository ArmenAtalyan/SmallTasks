public class BuildPalindrome {
    //Given a string, find the shortest possible string which can be
    // achieved by adding characters to the end of initial string to make it a palindrome.
    String buildPalindrome(String st) {

        if(isPalindrome(st))
            return st;

        StringBuilder sb = new StringBuilder(st);
        int i = 0;
        while(!isPalindrome(sb.toString())){
            sb.insert(sb.length()-i, st.charAt(i));
            i++;
        }
        return sb.toString();
    }

    private boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else
                return false;
        }
        return true;
    }
}
