public class IsBeautifulString {
    //A string is said to be beautiful if each letter in the string appears at
    // most as many times as the previous letter in the alphabet within the string;
    // ie: b occurs no more times than a; c occurs no more times than b; etc.
    //Given a string, check whether it is beautiful.
    boolean isBeautifulString(String inputString) {

        int[] alp = new int[26];

        for(int i = 0; i < inputString.length(); i++){
            alp[inputString.charAt(i)-'a']++;
        }
        for(int i = 0; i < alp.length-1; i++){
            if(alp[i] < alp[i+1]){
                return false;
            }
        }
        return true;
    }

}
