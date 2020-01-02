public class AbsoluteValuesSumMinimization {
    //Given a sorted array of integers a, your task is to determine
    // which element of a is closest to all other values of a.
    // In other words, find the element x in a, which minimizes the following sum:
    //abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
    //(where abs denotes the absolute value)
    //If there are several possible answers, output the smallest one.
    int absoluteValuesSumMinimization(int[] a) {

        int min = Integer.MAX_VALUE;
        int res = 0;

        for(int i : a){
            int sum = 0;
            for(int j : a){
                if(i != j)
                    sum += Math.abs(i-j);
            }
            if(sum < min){
                min = sum;
                res = i;
            }
        }
        return res;
    }

}
