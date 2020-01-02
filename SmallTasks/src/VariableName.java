import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableName {
    //Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.
    //Check if the given string is a correct variable name.
    boolean variableName(String name) {

        Matcher el = Pattern.compile("^[a-zA-Z0-9_]+").matcher(name);

        if(name.substring(0, 1).matches("[0-9]"))
            return false;
        if (!el.matches())
            return false;

        return true;
    }

}
