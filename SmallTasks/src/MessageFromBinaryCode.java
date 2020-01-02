public class MessageFromBinaryCode {
    //You are taking part in an Escape Room challenge designed
    // specifically for programmers. In your efforts to find a clue,
    // you've found a binary code written on the wall behind a vase,
    // and realized that it must be an encrypted message. After some thought,
    // your first guess is that each consecutive 8 bits of the code stand for
    // the character with the corresponding extended ASCII code.
    String messageFromBinaryCode(String code) {

        int bin = 0;
        int letter = code.length()/8;
        int test1 = 8;
        int test2 = 0;
        StringBuilder sb = new StringBuilder();

        while(letter-- > 0){
            bin = Integer.valueOf(code.substring(test2,test1), 2);
            sb.append(Character.toChars(bin));
            test1 += 8;
            test2 += 8;
        }
        return sb.toString();
    }

}
