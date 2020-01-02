public class DeleteDigit {
    //Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.
    int deleteDigit(int n) {

        String s1 = String.valueOf(n);
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < s1.length(); i++){
            StringBuilder s2 = new StringBuilder(s1);
            s2.deleteCharAt(i);
            int num = Integer.parseInt(s2.toString());
            if(max < num)
                max = num;
        }
        return max;
    }

}
