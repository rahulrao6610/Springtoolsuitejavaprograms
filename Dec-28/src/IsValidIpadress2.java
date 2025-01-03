public class IsValidIpadress2 {
    public static void main(String[] args) {
        String input = "172.001.154.1";
        String[] data = getArrayElement(input);
        int num = 0;
        boolean isValid = false;
        
        if (data.length == 4) {
            for (int i = 0; i < data.length; i++) {
                num = Integer.parseInt(data[i]);
                if ((num >= 0) && (num <= 255)) {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            }
        }
        
        if (isValid) {
            System.out.println("The IP address is valid.");
        } else {
            System.out.println("The IP address is not valid.");
        }
    }

    public static String[] getArrayElement(String input) {
        return input.split("\\.");
    }
}
