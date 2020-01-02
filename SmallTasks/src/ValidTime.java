public class ValidTime {
    //Check if the given string is a correct time representation of the 24-hour clock.
    boolean validTime(String time) {

        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3));

        if(h >= 0 && h <= 23 && m >= 0 && m <= 59)
            return true;
        return false;
    }

}
