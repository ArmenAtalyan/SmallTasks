public class IsLucky {
    //Ticket numbers usually consist of an even number of digits.
    // A ticket number is considered lucky if the sum of the first
    // half of the digits is equal to the sum of the second half.
    //Given a ticket number n, determine if it's lucky or not.
    boolean isLucky(int n) {

        int newN = n;
        int count = 0;
        int sum1 = 0;
        int sum2 = 0;

        while(n >= 1){
            count++;
            n /= 10;
        }
        if(count%2 != 0){
            return false;
        }
        for(int i = 0; i < count/2; i++){
            sum1 += newN%10;
            newN /= 10;
        }
        for(int j = 0; j < count/2; j++){
            sum2 += newN%10;
            newN /= 10;
        }
        return sum1==sum2 ? true : false;
    }
}
