import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AreSimilar {
    //Two arrays are called similar if one can be obtained
    // from another by swapping at most one pair of elements in one of the arrays.
    //Given two arrays a and b, check whether they are similar.
    boolean areSimilar(int[] a, int[] b) {

        boolean similar = true;
        int count = 0;
        Set setA = new HashSet();
        Set setB = new HashSet();

        if(!Arrays.equals(a, b)){
            similar = false;
        }

        for(int i = 0; i < a.length; i++){

            if(a[i] != b[i]){
                count++;
                setA.add(a[i]);
                setB.add(b[i]);
            }
        }
        if(count <= 2 && setA.equals(setB))
            similar = true;
        else
            similar = false;

        return similar;
    }

}
