public class ExtractEachKth {
    //Given array of integers, remove each kth element from it
    int[] extractEachKth(int[] inputArray, int k) {

        int[] array = new int[inputArray.length-(inputArray.length/k)];

        for(int i = 0, index = 0; i < inputArray.length; i++){
            if((i+1)%k != 0){
                array[index++] = inputArray[i];
            }
        }
        return array;
    }
}
