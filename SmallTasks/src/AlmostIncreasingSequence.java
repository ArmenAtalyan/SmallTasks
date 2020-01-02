public class AlmostIncreasingSequence {
    //Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing
    // sequence by removing no more than one element from the array.
    //Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an.
    // Sequence containing only one element is also considered to be strictly increasing.
    boolean almostIncreasingSequence(int[] arr) {

        int index = -1;
        int count = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i - 1] >= arr[i]){
                index = i;
                count++;
            }
        }

        if (count > 1)
            return false;
        if (count == 0)
            return true;
        if (index == arr.length - 1 || index == 1)
            return true;
        if (arr[index - 1] < arr[index + 1])
            return true;
        if (arr[index - 2] < arr[index])
            return true;

        return false;
    }

}
