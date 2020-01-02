public class DigitDegree {
    //Let's define digit degree of some positive integer as the number
    // of times we need to replace this number with the sum of its digits
    // until we get to a one digit number.
    //Given an integer, find its digit degree.
    int digitDegree(int n) {

        int count = 0;

        while(n >= 10){
            int sum = 0;
            while(n > 0){
                sum += n%10;
                n /= 10;
            }
            n = sum;
            count++;
        }
        return count;
    }

}
