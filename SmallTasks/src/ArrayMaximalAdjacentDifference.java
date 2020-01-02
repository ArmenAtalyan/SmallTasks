public class ArrayMaximalAdjacentDifference {
    //Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
    int arrayMaximalAdjacentDifference(int[] inputArray) {

        int maximal = Integer.MIN_VALUE;
        for(int i = 0; i < inputArray.length-1; i++) {
            int temp = Math.abs(inputArray[i+1] - inputArray[i]);
            maximal = Math.max(maximal, temp);
        }
        return maximal;
    }

}
