import java.util.Arrays;

public class MakeArrayConsecutive2 {
    //Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative
    // integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue
    // will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that.
    // Help him figure out the minimum number of additional statues needed.
    int makeArrayConsecutive2(int[] arr) {

        int count = 0;

        Arrays.sort(arr);
        for(int i = arr.length - 1; i > 0; i--){
            if((arr[i] - arr[i - 1]) > 1){
                count += (arr[i] - arr[i - 1]) - 1;
            }
        }
        return count;
    }
}
