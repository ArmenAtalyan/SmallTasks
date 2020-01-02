public class IsIPv4Address {
    //An IP address is a numerical label assigned to each device (e.g., computer, printer)
    // participating in a computer network that uses the Internet Protocol for communication.
    // There are two versions of the Internet protocol, and thus two versions of addresses.
    // One of them is the IPv4 address.
    //Given a string, find out if it satisfies the IPv4 address naming rules.
    boolean isIPv4Address(String inputString) {

        String[] arr = inputString.split("\\.");

        if (arr.length != 4)
            return false;

        for (String s : arr) {
            int num = 0;

            try {
                num = Integer.parseInt(s);
            }
            catch (Exception e) {
                return false;
            }

            if (!(num >= 0 && num <= 255))
                return false;
        }
        return true;
    }

}
