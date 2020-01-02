public class PalindromeRearranging {
    //Given a string, find out if its characters can be rearranged to form a palindrome.
    boolean palindromeRearranging(String inputString) {

        int[] list = new int[26];
        int count = 0;

        for(int i = 0; i < inputString.length(); i++){
            list[inputString.charAt(i)-'a']++;
        }

        for(Integer el : list){
            if(el%2 != 0)
                count++;
        }
        return count>1?false:true;
    }

}
