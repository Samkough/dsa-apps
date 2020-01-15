/*
Given a valid (IPv4) IP address,
return a defanged version of that IP address.
*/

public class DefangIPAddress {
    // ~O(n)
    public static String bfDefangIP(String address) {
        int length = address.length();
        for (int i = 0; i < length; i++) {
            if (address.charAt(i) == '.') {
                address = address.substring(0, i) + "[" + address.substring(i, i + 1) + "]" + address.substring(i + 1, address.length());
                i += 1;
                length += 2;
            }
        }
        
        return address;
    }

    public static void main (String args[]) {
        String ip = "1.1.1.1";
        System.out.println(ip + ": " + bfDefangIP(ip));
    }
}