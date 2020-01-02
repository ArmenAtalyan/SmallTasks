public class EvenDigitsOnly {
    //Check if all digits of the given integer are even.
    boolean evenDigitsOnly(int n) {

        int even = 0;
        int count = 0;

        while(n >= 1){
            even = n%10;
            if(even%2 != 0){
                count++;
            }
            n /= 10;
        }
        return count > 0 ? false : true;
    }

}
