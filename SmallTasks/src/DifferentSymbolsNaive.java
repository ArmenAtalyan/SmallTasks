import java.util.HashSet;
import java.util.Set;

public class DifferentSymbolsNaive {
    //Given a string, find the number of different characters in it.
    int differentSymbolsNaive(String s) {

        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        int count = 0;
        for(Character ch : set){
            count++;
        }
        return count;
    }

}
