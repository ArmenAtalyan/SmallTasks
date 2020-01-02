public class DepositProfit {
    //You have deposited a specific amount of money into your bank account.
    // Each year your balance increases at the same growth rate.
    // With the assumption that you don't make any additional deposits,
    // find out how long it would take for your balance to pass a specific threshold.
    int depositProfit(double deposit, int rate, int threshold) {

        int count = 0;
        double mod = 100/rate;
        double temp = 0;

        while(threshold > deposit){
            temp = deposit;
            deposit += temp/mod;
            count++;
        }
        return count;
    }

}
