public class DigitsProduct {
    //Given an integer product, find the smallest positive
    // (i.e. greater than 0) integer the product of whose
    // digits is equal to product. If there is no such integer, return -1 instead.
    int digitsProduct(int product) {

        if(product == 0)
            return 10;
        if(product == 1)
            return 1;

        int result = 0;
        for(int i = 9; i > 1; i--) {
            while(product%i == 0) {
                product /= i;
                result *= 10;
                result += i;
            }
        }
        if(product > 1)
            return -1;

        int rev = 0;
        while(result != 0) {
            rev = rev * 10 + (result%10);
            result /= 10;
        }
        return rev;
    }

}
