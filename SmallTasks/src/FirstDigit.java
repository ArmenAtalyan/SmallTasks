public class FirstDigit {
    //Find the leftmost digit that occurs in a given string.
    char firstDigit(String inputString) {

        char resalt = '4';
        for(int i = 0; i < inputString.length(); i++){
            if(Character.isDigit(inputString.charAt(i))){
                resalt = inputString.charAt(i);
                break;
            }
        }
        return resalt;
    }

}
