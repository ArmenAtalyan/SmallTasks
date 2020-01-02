public class CircleOfNumbers {
    //Consider integer numbers from 0 to n - 1 written down along the circle
    // in such a way that the distance between any two neighboring numbers is
    // equal (note that 0 and n - 1 are neighboring, too).
    //Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
    int circleOfNumbers(int n, int firstNumber) {

        int temp = 0;

        for(int i = 0; i < n; i++){
            if(i==firstNumber && firstNumber < n/2)
                temp = n/2 + i;
            else if(i==firstNumber && firstNumber > n/2)
                temp = firstNumber - n/2;
        }
        return temp;
    }

}
