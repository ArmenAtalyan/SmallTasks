public class CommonCharacterCount {
    //Given two strings, find the number of common characters between them.
    int commonCharacterCount(String s1, String s2) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int sum = 0;

        for(char ch1 : s1.toCharArray()){
            arr1[ch1 - 'a']++;
        }
        for(char ch2 : s2.toCharArray()){
            arr2[ch2 - 'a']++;
        }
        for(int k = 0; k < 26; k++){
            if(arr1[k] < arr2[k]){
                sum += arr1[k];
            }
            else{
                sum += arr2[k];
            }
        }
        return sum;
    }
}
