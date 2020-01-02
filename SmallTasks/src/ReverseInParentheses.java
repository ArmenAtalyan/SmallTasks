public class ReverseInParentheses {
    //Write a function that reverses characters in (possibly nested) parentheses in the input string.
    //Input strings will always be well-formed with matching ()s.
    String reverseInParentheses(String s) {

        while(s.indexOf("(") != (-1)){

            int end = s.indexOf(")");
            String temp = s.substring(0, end+1);
            int begin = temp.lastIndexOf("(");

            String middle = s.substring(begin+1, end);
            String reverse = new StringBuffer(middle).reverse().toString();

            s = s.substring(0, begin) + reverse + s.substring(end+1, s.length());
        }
        return s;
    }

}
