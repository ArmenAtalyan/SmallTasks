public class LineEncoding {
    //Given a string, return its encoding defined as follows:
    //    First, the string is divided into the least possible number of
    //    disjoint substrings consisting of identical characters
    //        for example, "aabbbc" is divided into ["aa", "bbb", "c"]
    //    Next, each substring with length greater than one is replaced with a
    //    concatenation of its length and the repeating character
    //        for example, substring "bbb" is replaced by "3b"
    //    Finally, all the new strings are concatenated together in the same
    //    order and a new string is returned.
    String lineEncoding(String s) {

        StringBuilder s2 = new StringBuilder();
        int count = 1;
        s += "*";

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1)==s.charAt(i))
                count++;
            else{
                if(count>1){
                    s2.append(count);
                }
                s2.append(s.charAt(i-1));
                count = 1;
            }
        }
        return s2.toString();
    }

}
