import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {
    //Given an array of strings, return another array containing all of its longest strings.
    String[] allLongestStrings(String[] inputArray) {

        List<String> longString = new ArrayList<>();
        int max = 0;

        for(String s : inputArray){
            if(s.length() > max){
                max = s.length();
            }
        }
        for(String a : inputArray){
            if(max == a.length()){
                longString.add(a);
            }
        }
        return longString.toArray(new String[longString.size()]);
    }

}
