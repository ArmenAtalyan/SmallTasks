public class ArrayChange {
    //You are given an array of integers. On each move you are allowed to increase exactly one of its element by one.
    // Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
    int arrayChange(int[] inputArray) {

        int sum = 0;

        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] <= inputArray[i-1]){
                sum += (inputArray[i-1]+1 - inputArray[i]);
                inputArray[i] = inputArray[i-1]+1;
            }
        }
        return sum;
    }

}
