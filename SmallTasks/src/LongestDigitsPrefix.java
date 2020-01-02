public class LongestDigitsPrefix {
    //Given a string, output its longest prefix which contains only digits.
    String longestDigitsPrefix(String inputString) {

        StringBuilder str = new StringBuilder();

        for(int i = 0; i < inputString.length(); i++){
            if(!(Character.isDigit(inputString.charAt(i))))
                break;
            else
                str.append(inputString.charAt(i));

        }
        return str.toString();
    }

}
