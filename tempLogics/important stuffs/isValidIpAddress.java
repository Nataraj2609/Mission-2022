package important_stuffs;

import java.util.regex.Pattern;

public class isValidIpAddress {
    public static void main(String[] args) {

        String ip = "127.0.0.1";
        String complexIp = "192.127.254.230";
        String invalidIp = "192.256.99.100";

        isValidIpAddressOrNot(ip);
        isValidIpAddressOrNot(complexIp);
        isValidIpAddressOrNot(invalidIp);
    }

    private static void isValidIpAddressOrNot(String ip) {
        System.out.print(ip+" ");


    }
}
