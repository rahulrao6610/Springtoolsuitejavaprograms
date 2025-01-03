import java.util.regex.Pattern;

public class IPAddressValidator {
    private static final String IPV4_REGEX = 
        "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}" +
        "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
    private static final String IPV6_REGEX = 
        "([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}|::";
    private static final Pattern IPV4_PATTERN = Pattern.compile(IPV4_REGEX);
    private static final Pattern IPV6_PATTERN = Pattern.compile(IPV6_REGEX);
    public static boolean isValidIPv4(String ip) {
        return IPV4_PATTERN.matcher(ip).matches();
    }
    public static boolean isValidIPv6(String ip) {
        return IPV6_PATTERN.matcher(ip).matches();
    }
    public static void main(String[] args) {
        String testIPv4 = "192.168.1.1";
        String testIPv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String invalidIP = "256.256.256.256";
        System.out.println(testIPv4 + " is valid IPv4? " + isValidIPv4(testIPv4));
        System.out.println(testIPv6 + " is valid IPv6? " + isValidIPv6(testIPv6));
        System.out.println(invalidIP + " is valid IPv4? " + isValidIPv4(invalidIP));
    }
}
