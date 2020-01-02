import java.util.ArrayList;
import java.util.Collections;

public class SortByHeight {
    //Some people are standing in a row in a park. There are trees between them which cannot be moved.
    // Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
    // People can be very tall!
    int[] sortByHeight(int[] a) {

        ArrayList<Integer> b = new ArrayList<>();

        for(Integer i : a){
            if(i != -1){
                b.add(i);
            }
        }
        Collections.sort(b);

        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != -1){
                a[i] = b.get(k++);
            }
        }
        return a;
    }

}
